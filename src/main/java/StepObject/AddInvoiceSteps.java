package StepObject;
import PageObject.AddInvoicePage;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class AddInvoiceSteps extends AddInvoicePage {
    @Step("Click add invoice button")
    public AddInvoiceSteps AddInvoiceBtn() {
        addInvoiceBtn.click();
        return this;
    }
   @Step("Fill invoice number with random string: {randomAlphabet}")
    public AddInvoiceSteps InvoiceNumberInput(String randomAlphabet) {
        invoiceNumberInput.setValue(randomAlphabet);
        return this;
    }
@Step("Click on invoice ID dropdown")
    public AddInvoiceSteps InvoiceIdInput() {
        invoiceIdInput.click();
        return this;
    }
    @Step("Choose invoice ID from the dropdown")
    public AddInvoiceSteps InvoiceIdDrpDown() {
        invoiceIdDrpDown.click();
        return this;
    }
    @Step("Fill invoice amount: {invoiceAmount}")
    public AddInvoiceSteps AmountInput(String invoiceAmount) {
        amountInput.setValue(invoiceAmount);
        return this;
    }
    @Step("Fill due date: {invoiceDueDate}")
    public AddInvoiceSteps DueDate(String invoiceDueDate) {
        dueDate.setValue(invoiceDueDate);
        return this;
    }
    @Step("Click on update invoice button")
    public AddInvoiceSteps InvoiceUpdateBtn() {
        invoiceUpdateBtn.doubleClick();
        return this;
    }
@Step("Open Clients page")
    public AddInvoiceSteps OpenClientPage() {
        sleep(5000);
        open("https://dev.ram.syniotec.com/clients/detail/ecfdbf25-978d-46d8-acbe-d3ce5508a022/overview");
        return this;
    }
@Step("Open clients financial section")
    public AddInvoiceSteps OpenFinancePage() {
        sleep(5000);
        open("https://dev.ram.syniotec.com/clients/detail/ecfdbf25-978d-46d8-acbe-d3ce5508a022/finances");

        return this;
    }
@Step("Sort invoice table by date")
public AddInvoiceSteps SortByDate(){
        sleep(5000);
    sortByDate.doubleClick();
    return this;
}
@Step("Choose only already paid invoices")
public AddInvoiceSteps StatusPaid(){
        sleep(5000);
    statusPaid.click();
    return this;
}
@Step("Choose first result after selection")
public AddInvoiceSteps FirstResult(){
        sleep(5000);
    firstResult.click();
    return this;
}
@Step("Edit invoice number with: {invoiceNum}")
public AddInvoiceSteps EditInvNumInput(String invoiceNum){
    invoiceNumberInput.click();
    sleep(3000);
    invoiceNumberInput.setValue(invoiceNum);
    return this;
}




}




