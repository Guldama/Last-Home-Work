import StepObject.AddBookingSteps;
import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class AddBookingTest extends ChromeRunner {
    AddBookingSteps addBookingSteps = new AddBookingSteps();
    LoginPageSteps loginPageSteps = new LoginPageSteps();


    @Test

    public void Addfreebooking(){
        loginPageSteps.SucceccfullLogin();
        addBookingSteps.GoToRentalListing()
                .GoToRentalpage()
                .CheckBookingCount()
                .AddBookingBtn()
                .EquipmentStatusFilter()
                .AvailableStatus()
                .EquipmentStatusFilter()
                .OpenBookingdrawer()
                .AddBookingLoop()
                .BackTorenTalBtn()
                .CheckBookingCount();

    }
    @Test
public void FullyBookedEquipment(){
        addBookingSteps.GoToRentalListing()
                .GoToRentalpage()
                .AddBookingBtn()
                .FullyBooked()
                .EquipmentStatusFilter();



}


}




