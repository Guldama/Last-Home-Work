package PageObject;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
public class LoginPage {
    public SelenideElement
       emailInput = $(byAttribute("formcontrolname","username")),
       passwordInput = $(byAttribute("formcontrolname","password")),
       remembermeCheckBox = $(byXpath("//*[@id=\"left-section\"]/main/app-sign-in-container/form/div[3]/div[1]/div/label")),
       loginBtn = $(byClassName("btn-primary")),
      loginErrorFormail = $(byText("Falsche Email")),
       loginErrorforbtn = $(byText("*missing_required_parameter_auth_parameters")),

      rememberMeText = $(byText("Passwort speichern"));
}
