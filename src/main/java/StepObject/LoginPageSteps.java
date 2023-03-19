package StepObject;

import PageObject.LoginPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static DataObject.LoginPageData.*;

public class LoginPageSteps extends LoginPage {

    public LoginPageSteps EmailInput(String email){
        emailInput.setValue(email);
        return this;
    }

    public LoginPageSteps  PasswordInput(String password){
        passwordInput.setValue(password);
        return this;
    }

    public LoginPageSteps RememberMe (){
        remembermeCheckBox.click();
        return this;

    }

    public LoginPageSteps LoginBtnClick(){
        loginBtn.click();
        return this;
    }

    public LoginPageSteps SucceccfullLogin() {
        EmailInput(email);
        PasswordInput(password);
        RememberMe();
        LoginBtnClick();
        return this;
    }

    public LoginPageSteps emptyInputs(String name, String password){
        emailInput.setValue(emptymail);
        passwordInput.setValue(emptypassword);
        loginBtn.click();
        loginErrorFormail.shouldBe(Condition.visible,Duration.ofMillis(6000));
        loginErrorforbtn.shouldBe(Condition.visible, Duration.ofMillis(6000));
        return this;

    }

}

