import Utils.ChromeRunner;
import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Secondtest extends ChromeRunner{
        @Test
public void Part_3(){
    open("https://ee.ge/");
    $(byClassName("cart-count")). click();
    $(byText("კალათა ცარიელია")).should(visible);
    $(byId("search_list")). setValue("lenovo");
    $(byClassName("fa-search")). click();
    ElementsCollection collection = $$(byClassName("fa-shopping-cart"));
    int count = collection.size();
    for(int i = 0; i < count; i++);
    $(byClassName("fa-shopping-cart"), 0). click();
    $(byClassName("cart-count")). click();
    $(byText("კალათა ცარიელია")).shouldNotBe(visible);
    $(byText("წაშლა")).click();
    $(byText("კალათა ცარიელია")).should(visible);
}
        @Test
        public void Part_4(){
            open("https://ee.ge/");
            $(byClassName("cart-count")).click();
            $(byText("კალათა ცარიელია")).shouldBe(visible);
            sleep(5000);
            $(byText("შენახული ნივთები")).click();
            $(byText("ვერ მოიძებნა")).shouldBe(visible);
            sleep(5000);
            $(byId("search_list")).setValue("lenovo");
            $(byClassName("fa-search")).click();
            sleep(5000);
            ElementsCollection collection = $$(byClassName("fa-shopping-cart"));
            int count = collection.size();
            for (int i = 0; i < count; i++) ;
            $(byClassName("fa-shopping-cart"), 0).click();
            sleep(5000);
            $(byClassName("cart-count")).click();
            $(byText("შენახვა")).click();
            sleep(5000);
            $(byText("შენახული ნივთები")).click();
            $(byText("ვერ მოიძებნა")).shouldNotBe(visible);
            sleep(5000);
            $(byClassName("cart-count")).click();
            $(byText("კალათა ცარიელია")).shouldBe(visible);
            sleep(5000);
            $(byText("შენახული ნივთები")).click();
            $(byClassName("fa-times")).click();
            $(byText("ვერ მოიძებნა")).shouldNotBe(visible);
            sleep(5000);
        }
}
