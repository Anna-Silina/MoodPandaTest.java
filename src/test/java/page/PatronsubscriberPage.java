package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class PatronsubscriberPage {
    private static final String YOUR_PATRON_LINK = "//a[@href='/feed/global']";

    public PatronsubscriberPage clickYorPatronsubscriberLink() {
        $(By.xpath(YOUR_PATRON_LINK)).click();
        return new PatronsubscriberPage();
    }

    public boolean isSuccessMessaDisplayed() {
        return $(By.xpath(YOUR_PATRON_LINK)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();

    }
}