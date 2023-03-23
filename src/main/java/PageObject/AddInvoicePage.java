package PageObject;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
public class AddInvoicePage {
    public SelenideElement
     addInvoiceBtn = $(byAttribute("aria-label", "add-icon")),
     invoiceNumberInput =$(byClassName("input-without-label"), 1),
     invoiceIdInput = $(byAttribute("formcontrolname","contractId")),
     invoiceIdDrpDown = $(byClassName("shl-select-option-text-primary")),
     amountInput =  $(byClassName("input-without-label"), 2),
     dueDate = $(byClassName("input-without-label"), 3),
     sortByDate = $(byClassName("ng-trigger-arrowPosition"), 1),
     statusPaid = $(byClassName("filters__leftside-button-radio--paid")),
     firstResult = $(byClassName("highlightTableColor")),
            duplicatedInvoiceError =$(byText("Invoice ID already exists")),
     invoiceUpdateBtn = $(byClassName("invoice__footer-save"));


}
