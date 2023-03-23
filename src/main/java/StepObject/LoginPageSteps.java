package StepObject;
import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static DataObject.LoginPageData.*;
public class LoginPageSteps extends LoginPage {
    @Step("Fill mail input: {email}")
    public LoginPageSteps EmailInput(String email){
        emailInput.setValue(email);
        return this;
    }
    @Step("Fill password input: {password}")
    public LoginPageSteps  PasswordInput(String password){
        passwordInput.setValue(password);
        return this;
    }
@Step("Click on remember me check box")
    public LoginPageSteps RememberMe (){
        remembermeCheckBox.click();
        return this;
    }
    @Step("Click on login button")
    public LoginPageSteps LoginBtnClick(){
        loginBtn.click();
        return this;
    }
    @Step("Successful login flow")
    public LoginPageSteps SuccessfullLogin() {
        EmailInput(email);
        PasswordInput(password);
        rememberMeText.shouldBe(Condition.visible,(Duration.ofMillis(6000)));
        RememberMe();
        LoginBtnClick();
        return this;
    }

}

