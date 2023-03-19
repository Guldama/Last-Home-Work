import Utils.ChromeRunner;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.Random;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Secondtest extends ChromeRunner{
        @Test
public void addInvoice(){
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            int length = 7;
            for(int i = 0; i < length; i++) {
                int index = random.nextInt(alphabet.length());
                char randomChar = alphabet.charAt(index);
                sb.append(randomChar);
            }

            String randomString = sb.toString();
            sleep(5000);
                open("https://dev.ram.syniotec.com/clients/detail/ecfdbf25-978d-46d8-acbe-d3ce5508a022/finances");
                $(byClassName("invoices__top__rightside-addinvoice")).click();

//              Assertions
            $(byClassName("input-without-label"), 1).shouldBe(empty);
            $(byClassName("shl-icon-arrow-down")).shouldBe(empty);
            $(byClassName("input-without-label"), 2).shouldBe(empty);
            $(byClassName("input-without-label"), 3).shouldBe(empty);
//            $(byClassName("invoice__footer-discard")).shouldBe(disabled);

//             aq iwkeba isev test

            $(byClassName("input-without-label"), 1).setValue(randomString);
            $(byClassName("shl-icon-arrow-down")).click();
            $(byClassName("shl-select-option-text-primary"), 1).click();
            $(byClassName("input-without-label"), 2).setValue("100");
            $(byClassName("input-without-label"), 3).setValue("01/03/2023");
            $(byClassName("invoice__footer-discard")).doubleClick();
            sleep(10000);

}

        @Test
        public void editInvoice(){
            open("https://dev.ram.syniotec.com/clients/detail/ecfdbf25-978d-46d8-acbe-d3ce5508a022/finances");
            $(byClassName("ng-trigger-arrowPosition"), 2).doubleClick();
            $(byClassName("filters__leftside-button-radio--paid")).click();
            $(byClassName("finance-table__table-item-status--unpaid")).shouldNotBe(visible);
            $(byClassName("finance-table__table-item-status--pending")).shouldNotBe(visible);
            $(byClassName("highlightTableColor")).click();
            $(byClassName("invoice__footer-save")).shouldBe(enabled);
            $(byClassName("shl-checkbox-box")).isSelected();
            $(byClassName("input-without-label"), 1).click();
//            $(byClassName("input-without-label"), 1).clear();
            $(byClassName("shl-icon-close"), 0).click();
            sleep(5000);

            $(byClassName("invoice__footer-save")).shouldBe(disabled);
            sleep(5000);









        }
}
