package StepObject;

import PageObject.AddBookingPage;
import PageObject.AddInvoicePage;

import static DataObject.AddInvoiceData.invoicenum;

public class AddInvoiceSteps extends AddInvoicePage {
    public AddInvoiceSteps AddInvoiceBtn(){
        addInvoiceBtn.click();
        return this;
    }

    public AddInvoiceSteps InvoiceNumberInput(String invoicenum){
        invoiceNumberInput.setValue(invoicenum);
        return this;
    }
    public AddInvoiceSteps InvoiceIdInput(){
        invoiceIdInput.click();
        return this;
    }

    public AddInvoiceSteps InvoiceIdDrpDown(){
        invoiceIdDrpDown.click();
        return this;

    }

    public AddInvoiceSteps AmountInput(String invoiceAmount){
        amountInput.setValue(invoiceAmount);
        return this;
    }
   public AddInvoiceSteps DueDateInput(String invoiceDueDate){
    dueDateInput.setValue(invoiceDueDate);
    return this;
}

   public AddInvoiceSteps InvoiceUpdateBtn(){
       invoiceUpdateBtn.click();
       return this;
   }

}

