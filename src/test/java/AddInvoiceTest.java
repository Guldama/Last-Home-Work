import StepObject.AddInvoiceSteps;
import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.AddInvoiceData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class AddInvoiceTest extends ChromeRunner {

    AddInvoiceSteps addInvoiceSteps = new AddInvoiceSteps();
    LoginPageSteps loginPageSteps = new LoginPageSteps();
    SoftAssert soft = new SoftAssert();

    @Test
    @Description("Creating invoice with unique invoice name")
    @Severity(SeverityLevel.NORMAL)
    public void CreateNewInvoice() {
        Utilsa a = new Utilsa();
        loginPageSteps.SuccessfullLogin();
        addInvoiceSteps.OpenClientPage()
                .OpenFinancePage()
                .AddInvoiceBtn();
        sleep(5000);
        soft.assertTrue(addInvoiceSteps.amountInput.is(Condition.empty), "Invoice Amount Is Required");
        soft.assertTrue(addInvoiceSteps.dueDate.is(Condition.empty), "Invoice DueDate Is Required");
        soft.assertTrue(addInvoiceSteps.invoiceUpdateBtn.is(Condition.disabled), "Update Invoice Is Disabled");
        a.randomizer();
        addInvoiceSteps.InvoiceNumberInput(a.randomizer())
                .InvoiceIdInput()
                .InvoiceIdDrpDown()
                .AmountInput(invoiceAmount)
                .DueDate(invoiceDueDate);
        soft.assertTrue(addInvoiceSteps.invoiceUpdateBtn.is(Condition.enabled), "Update Invoice Is Enabled");
        addInvoiceSteps.InvoiceUpdateBtn();
        soft.assertAll();
    }

    @Test
    @Description("Edit invoice and attach a file")
    @Severity(SeverityLevel.NORMAL)
    public void InvoiceNumValidation() {
        loginPageSteps.SuccessfullLogin();
        addInvoiceSteps.OpenFinancePage();
        addInvoiceSteps.SortByDate()
                .StatusPaid();
        addInvoiceSteps.FirstResult();
        sleep(5000);
        soft.assertTrue(addInvoiceSteps.invoiceUpdateBtn.is(Condition.enabled), "Update Invoice Is Enabled");
        addInvoiceSteps.EditInvNumInput(invoiceNum);
        sleep(3000);
       addInvoiceSteps.InvoiceUpdateBtn();
       soft.assertTrue(addInvoiceSteps.duplicatedInvoiceError.isDisplayed(),"invoice must not be added");
        soft.assertAll();
    }

}




