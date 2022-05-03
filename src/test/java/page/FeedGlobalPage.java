package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FeedGlobalPage {
    private static final String YOUR_DASHBOARD_LINK = "//a[@href='/dashboard']";

    public DashboardPage clickYorDashboarLink() {
        $(By.xpath(YOUR_DASHBOARD_LINK)).click();
        return new DashboardPage();

    }

    private static final String YOUR_PATRON_LINK = "//a[@href='/feed/global']";

    public PatronsubscriberPage clickYorPatronsubscriberlink() {
        $(By.xpath(YOUR_PATRON_LINK)).click();
        return new PatronsubscriberPage();
    }
}


