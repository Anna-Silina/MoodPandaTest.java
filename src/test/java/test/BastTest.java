package test;

import com.codeborne.selenide.Config;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.DashboardPage;
import page.FeedGlobalPage;
import page.LoginPage;
import page.PatronsubscriberPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class BastTest {
    protected LoginPage loginPage;
    protected FeedGlobalPage feedGlobalPage;
    protected DashboardPage dashboardPage;
    protected PatronsubscriberPage patronsubscriberPage;

    @BeforeClass
    public void init() {
        Configuration.browser = "chome";
        Configuration.timeout = 5000;
        Configuration.holdBrowserOpen = false;
        Configuration.headless = false;
        loginPage = new LoginPage();
        feedGlobalPage = new FeedGlobalPage();
        patronsubscriberPage = new PatronsubscriberPage();
    }
    @AfterClass
    public void quit(){
        getWebDriver().quit();
    }

}
