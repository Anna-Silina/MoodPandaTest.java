package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {
    private static String RATING_SELECT = "//td//select";
    private static String UPDATE_BUTTON = "//button[@class='button is-primary is-outdlined is-rounded']";
    private static String SUCCESS_MESSAGE = "//*[contains(text(), 'Post updated')] ";


    private static final int  RATING_POSITION = 0;

    public DashboardPage setuprating (String rating){
       $$(By.xpath(RATING_SELECT)).get(RATING_POSITION).click();
       return this;
    }
    public DashboardPage clickUpdateButton () {
        $$(By.xpath(UPDATE_BUTTON)).get(RATING_POSITION).click();
        return this;
    }

    public boolean isSuccessMessaDisplayed() {
        return $(By.xpath(SUCCESS_MESSAGE)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }
}

