import StepObject.AddBookingSteps;
import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.sleep;

public class AddBookingTest extends ChromeRunner {
    AddBookingSteps addBookingSteps = new AddBookingSteps();
    LoginPageSteps loginPageSteps = new LoginPageSteps();
    SoftAssert soft = new SoftAssert();

    @Test
    @Description("Add available equipment bookings to the rental")
    @Severity(SeverityLevel.CRITICAL)
    public void AddFreeBooking(){
        Utilsa a = new Utilsa();
        loginPageSteps.SuccessfullLogin();
        addBookingSteps.GoToRentalListing()
                .GoToRentalPage()
                .CheckBookingCount();
        String bookingQuantity = addBookingSteps.bookingQuantity.getText();
        int initialCount = a.split(bookingQuantity);
        addBookingSteps.AddBookingBtn()
                .EquipmentStatusFilter()
                .AvailableStatus();
        soft.assertFalse(addBookingSteps.fullyBookedCheckBox.isSelected(),"Booked Equipments Are not Shown");
        soft.assertFalse(addBookingSteps.partiallyBookedCheckBox.isSelected(),"Partially Booked Equipments are not Shown");
        addBookingSteps.EquipmentStatusFilter()
                .AddBookingLoop()
                .BackToRenTalBtn()
        .CheckBookingCount();
        String bookingQuantity2 = addBookingSteps.bookingQuantity.getText();
        int lastQuantity = a.split(bookingQuantity2);
        int addedProductQuantity = 5;
        soft.assertEquals(addedProductQuantity + initialCount, lastQuantity, "Bookings Increased");
        soft.assertAll();

    }
    @Test
    @Description("Check error messages for overlap")
    @Severity(SeverityLevel.CRITICAL)
    public void FullyBookedEquipment(){
        Utilsa a = new Utilsa();
        loginPageSteps.SuccessfullLogin();
        addBookingSteps.GoToRentalListing();
        addBookingSteps.GoToRentalPage()
                .CheckBookingCount();
        String bookingQuantity = addBookingSteps.bookingQuantity.getText();
        int initialCount = a.split(bookingQuantity);
        addBookingSteps.AddBookingBtn()
                .FullyBooked();
        addBookingSteps.AddBookedEquipment();
        soft.assertTrue(addBookingSteps.bookingOverlapError.isDisplayed(), "Checking error message for overlap");
        addBookingSteps.BackToRenTalBtn()
                .CheckBookingCount();
        String bookingQuantity2 = addBookingSteps.bookingQuantity.getText();
        int lastQuantity = a.split(bookingQuantity2);
        soft.assertEquals(initialCount, lastQuantity, "Booking quantity is not changed");
        soft.assertAll();

    }

    @Test
    @Description("Delete all bookings")
    @Severity(SeverityLevel.NORMAL)
    public void DeleteAllBookings(){
        loginPageSteps.SuccessfullLogin();
        addBookingSteps.GoToRentalListing();
        addBookingSteps.GoToRentalPage();
        sleep(5000);
        addBookingSteps.DeleteAllBookings();

}
}




