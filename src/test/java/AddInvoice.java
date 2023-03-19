import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
//import io.qameta.allure.Description;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.chrono.IsoChronology;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AddInvoice extends ChromeRunner {

    @Test

    public void addooking() {

        String bookingQuantity = $(byClassName("bookings-header__leftside-count")).getText();
        Utilsa a = new Utilsa();
        Integer initialCount = a.split(bookingQuantity);




        $(byAttribute("key", "add")).click();
        sleep(5000);
        $(byAttribute("formcontrolname", "bookingStatuses")).click();
        $(byClassName("shl-select-option-checkbox")).click();
        $(byAttribute("formcontrolname", "bookingStatuses")).click();
        $(byClassName("card__details-status--full")).shouldNotBe(Condition.visible);
        $(byClassName("card__details-status--partial")).shouldNotBe(Condition.visible);
        sleep(2000);


        sleep(5000);
        ElementsCollection addBooking = $$(byId("Group_10668"));
        int bookingLength = addBooking.size();
        for (int i = 0; i < 5; i++) {
            addBooking.get(i).click();
            $(byClassName("shl-button-content-container-value"), 3).click();
//            es shevamowmo
            $(byClassName("header__actions-back")).click();
        }
            String quantityAfterBooking = $(byClassName("bookings-header__leftside-count")).getText();
            Integer lastQuantity = a.split(bookingQuantity);
            boolean result = lastQuantity == initialCount +5;
        System.out.println(result);



    }
}

