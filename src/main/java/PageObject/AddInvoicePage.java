package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class AddInvoicePage {

    public SelenideElement
     addInvoiceBtn = $(byClassName("invoices__top__rightside-addinvoice")),
     invoiceNumberInput =$(byClassName("input-without-label"),1),
     invoiceIdInput = $(byClassName("shl-icon-arrow-down")),
     invoiceIdDrpDown = $(byClassName("shl-select-option-text-primary")),
     amountInput = $(byClassName("input-without-label"),2),
     dueDateInput = $(byClassName("input-without-label"),3),
     invoiceUpdateBtn = $(byClassName("invoice__footer-discard"));


}
