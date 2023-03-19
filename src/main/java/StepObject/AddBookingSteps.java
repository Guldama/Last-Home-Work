package StepObject;

import PageObject.AddBookingPage;
import com.beust.ah.A;
import org.aspectj.weaver.Utils;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class AddBookingSteps extends AddBookingPage {

  public AddBookingSteps AddBookingBtn(){
      addBookingBtn.click();
      return this;
  }
  public AddBookingSteps EquipmentStatusFilter(){
        equipmentStatusFilter.click();
      sleep(5000);
        return this;

    }
    public AddBookingSteps AvailableStatus(){
        availableStatusChekBox.click();
        return this;

    }

  public AddBookingSteps SubmitBookinglBtn(){
      clickSubmit.click();
      return this;
  }

  public AddBookingSteps BackTorenTalBtn(){
      backTorenTalBtn.click();
      sleep(2000);
      return this;
  }

  public AddBookingSteps OpenBookingdrawer(){
      openBookingdrawer.click();
      return this;
  }

 public AddBookingSteps GoToRentalListing () {
      sleep(3000);
    open("https://dev.ram.syniotec.com/rental");

    return this;
}

 public AddBookingSteps GoToRentalpage(){
    open("https://dev.ram.syniotec.com/rental/detail/1826401f-f37a-4bd5-a746-e5d1fbd11530");

    return this;
}


 public AddBookingSteps AddBookingLoop() {
     sleep(5000);
     int bookingLength = addBookingQuantity.size();
     for (int i = 0; i < 5; i++) {
         addBookingQuantity.get(i).click();
         SubmitBookinglBtn();
         sleep(3000);
     }
     return this;
 }

    public AddBookingSteps AddBookedEquipment(){
        int busyEquipment = addBookingQuantity.size();
        for (int i = 0; i < busyEquipment; i++);
        clickSubmit.click();
         return this;
     }

  public AddBookingSteps CheckBookingCount(){
      bookingQuantity.getText();
      return  this;

  }

  public AddBookingSteps FullyBooked(){
      equipmentStatusFilter.click();
      fullyBookedCeckBox.click();
      return this;
  }
}
