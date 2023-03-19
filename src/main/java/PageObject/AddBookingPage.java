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
            availableStatusChekBox = $(byClassName("shl-select-option-checkbox"),0),
            fullyBookedCeckBox = $(byClassName("shl-select-option-checkbox"),1),
            fullyBookedStatus = $(byClassName("card__details-status--full")),
            partiallyBookedStatuss = $(byClassName("card__details-status--partial")),

            freeStatuss = $(byClassName("card__details-status--free")),

            submitBookinglBtn = $(byClassName("shl-button-content-container-value"),3),
            backTorenTalBtn = $(byClassName("header__actions-back")),
            openBookingdrawer = $(byId("Group_10668")),

           bookingOverlapError = $(byText("Booking overlap")),


            clickSubmit = $(byText("Submit"));







    public ElementsCollection
            addBookingQuantity = $$(byClassName("card__details-text--bold"));




}
