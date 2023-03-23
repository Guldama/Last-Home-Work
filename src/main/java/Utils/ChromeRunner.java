package Utils;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.*;
public class ChromeRunner {
    @BeforeMethod(description = "Configure browser before tests")
   public void setUp(){
       System.setProperty("selenide.browserSize","1980x1080");
       open("https://id.dev.ram.syniotec.com/?destination=https:%2F%2Fdev.ram.syniotec.com");
        sleep(7000);
    }
    @AfterMethod(description = "Close browser and clear cookies")
    public void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}


