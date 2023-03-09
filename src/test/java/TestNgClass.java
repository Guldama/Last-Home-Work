import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TestNgClass extends ChromeRunner {
    @Test

    public void Part_1(){
        open("https://ee.ge/");
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).should(visible);
        $(byId("firstName")).setValue("nina").shouldNot(Condition.empty);
        $(byId("lastName")).setValue("guldama").shouldNot(Condition.empty);
        $(byId("email")).setValue("guldama@gmail.com").shouldNot(Condition.empty);
        $(byId("password")).setValue("gulda").shouldNot(Condition.empty);
        $(byId("confirmPassword")).setValue("gulda").shouldNot(Condition.empty);
        $(byId("singup")).should(Condition.disabled);
    }

    @Test
    public void Part_2(){
        open("https://ee.ge/");
        $(byId("rcc-confirm-button")).click();
        $(byText("რეგისტრაცია")). click();
        $(byText("სწრაფი რეგისტრაცია")).should(visible);
        $(byId("firstName")). click();
        $(byId("lastName")). click();
        $(byText("სახელი სავალდებულოა")). should(visible);
        $(byId("email")). click();
        $(byText("გვარი სავალდებულოა")). should(visible);
        $(byId("password")).click();
        $(byText("ელ. ფოსტა სავალდებულოა")). shouldBe(visible);
        $(byId("confirmPassword")). click();
        $(byText("პაროლი სავალდებულოა.")). should(visible);
        $(byId("password")). click();
        $(byText("პაროლის გამეორება სავალდებულოა")). should(visible);
        $(byId("email")).setValue("guldamagmail.com").shouldNot(Condition.empty);
        $(byText("ელ. ფოსტა სავალდებულოა")). should(visible);
        $(byId("password")).setValue("gulda").shouldNot(Condition.empty);
        $(byText("პაროლი სავალდებულოა.")). should(visible);
        $(byId("confirmPassword")).setValue("guldama").shouldNot(Condition.empty);
        $(byText("პაროლის გამეორება სავალდებულოა")). should(visible);
        $(byId("singup")). click();
        $(byId("singup")).should(Condition.disabled);
    }

}