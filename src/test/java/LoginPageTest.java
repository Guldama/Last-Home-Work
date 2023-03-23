import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static DataObject.LoginPageData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPageTest extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Test
    @Description("Login test with correct credentials")
    @Severity(SeverityLevel.BLOCKER)
    public void correctUserNameOrPassword() {
        loginPageSteps.EmailInput(email)
                .PasswordInput(password)
                .LoginBtnClick();
        Assert.assertFalse(loginPageSteps.loginErrorFormail.is(Condition.visible),"E-mail error validation");
        Assert.assertFalse(loginPageSteps.loginErrorforbtn.is(Condition.visible), "Login error validation");
    }

    @Test
    @Description("Login test with empty inputs")
    @Severity(SeverityLevel.BLOCKER)
    public void EmptyInputsLogin() {
        loginPageSteps.LoginBtnClick();
        sleep(5000);
        SoftAssert soft = new SoftAssert();
        Assert.assertTrue(loginPageSteps.loginErrorforbtn.is(Condition.visible), "Login error validation");

    }

}

