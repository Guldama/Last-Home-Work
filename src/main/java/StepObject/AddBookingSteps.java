package StepObject;
import PageObject.AddBookingPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
public class AddBookingSteps extends AddBookingPage {
@Step("Click on add booking button")
  public AddBookingSteps AddBookingBtn(){
      addBookingBtn.click();
      return this;
  }
    @Step("Click on availability dropdown")
  public AddBookingSteps EquipmentStatusFilter(){
        equipmentStatusFilter.click();
      sleep(5000);
        return this;
    }
    @Step("Choose available status")
    public AddBookingSteps AvailableStatus(){
        availableStatusCheckBox.click();
        return this;
    }
    @Step("Click on submit button")
  public AddBookingSteps SubmitBookinglBtn(){
      clickSubmit.click();
      return this;
  }
    @Step("Click on back to rental button")
  public AddBookingSteps BackToRenTalBtn(){
      backToRentalBtn.click();
      sleep(2000);
      return this;
  }
    @Step("Click on equipment card")
  public AddBookingSteps OpenBookingDrawer(){
      openBookingDrawer.click();
      return this;
  }
    @Step("Open rental listing page")
 public AddBookingSteps GoToRentalListing () {
    sleep(3000);
    open("https://dev.ram.syniotec.com/rental");
    return this;
}
    @Step("Click on add booking button")
 public AddBookingSteps GoToRentalPage(){
    open("https://dev.ram.syniotec.com/rental/detail/1826401f-f37a-4bd5-a746-e5d1fbd11530");
    return this;
}
    @Step("Add equipments to the booking")
 public AddBookingSteps AddBookingLoop() {
     sleep(5000);
     for (int i = 0; i < 5; i++) {
         addBookingQuantity.get(i).click();
         sleep(2000);
         SubmitBookinglBtn();
         sleep(2000);
     }
     return this;
 }
 public AddBookingSteps DeleteAllBookings() {
     sleep(3000);
    for (int i = 0; i < bookingItemsDelete.size(); i++) {
        bookingItemsDelete.get(i).click();
         submitForDelete.click();
         sleep(3000);
     }
     return this;
 }
    @Step("Add fully booked equipments to the booking")
    public AddBookingSteps AddBookedEquipment() {
        sleep(5000);
        for (int i = 0; i < 2; i++) {
            addBookingQuantity.get(i).click();
            sleep(2000);
            SubmitBookinglBtn();
            sleep(2000);
        }
        return this;
    }
    @Step("check booking quantity")
  public AddBookingSteps CheckBookingCount(){
      bookingQuantity.getText();
      sleep(5000);
      return  this;
  }
    @Step("Choose fully booked status from dropdown and close")
  public AddBookingSteps FullyBooked(){
      equipmentStatusFilter.click();
      fullyBookedCheckBox.click();
      sleep(5000);
      equipmentStatusFilter.click();
      return this;
  }
}
