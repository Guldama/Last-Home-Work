import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.*;
import static DataObject.LoginPageData.*;

public class LoginPageTest extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Test
    public void correctUserNameOrPassword() {

        loginPageSteps.EmailInput(email)
                .PasswordInput(password)
                .LoginBtnClick();
        Assert.assertFalse(loginPageSteps.loginErrorFormail.is(Condition.visible));
        Assert.assertFalse(loginPageSteps.loginErrorforbtn.is(Condition.visible));
    }

    @Test
    public void EmptyInputsLogin() {

        loginPageSteps.EmailInput(emptymail)
                .PasswordInput(emptypassword)
                .LoginBtnClick();
        Assert.assertTrue(loginPageSteps.loginErrorFormail.is(Condition.visible));
        Assert.assertTrue(loginPageSteps.loginErrorforbtn.is(Condition.visible));


    }

}

