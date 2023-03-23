package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AddBookingPage {
    public SelenideElement
            bookingQuantity = $(byClassName("bookings-header__leftside-count")),
            addBookingBtn = $(byAttribute("key", "add")),
            equipmentStatusFilter = $(byAttribute("formcontrolname", "bookingStatuses")),
            availableStatusCheckBox = $(byClassName("shl-select-option-checkbox"),0),
            fullyBookedCheckBox = $(byClassName("shl-select-option-checkbox"),1),
           partiallyBookedCheckBox = $(byClassName("shl-select-option-checkbox"),2),
            submitBookingBtn = $(byClassName("shl-button-content-container-value"),3),
            backToRentalBtn = $(byClassName("header__actions-back")),
            openBookingDrawer = $(byId("Group_10668")),

           bookingOverlapError = $(byText("Booking overlap")),

          submitForDelete = $(byClassName("btn-primary")),
            clickSubmit = $(byText("Submit"));





    public ElementsCollection
            addBookingQuantity = $$(byTagName("sm-equipment-card")),
            bookingItemsDelete = $$(byClassName("booking-item__top-info-delete"));



}
