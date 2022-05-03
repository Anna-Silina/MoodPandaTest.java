package page;

import model.User;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private String LOGIN_URL = "https://moodpanda.com/login";
    private static String EMAIL_IMPUT = "//input[@placeholder='MoodPanda registered email ']";
    private static String PASSWORD_IMPUT ="//input[@name='password']";
    private static String LOGIN_BUTTON = "//button[@class=\'button is-vcentered is-danger is-rounded is-fullwidth is-oudtlined\']";

    public LoginPage openLoginPage() {
        open(LOGIN_URL);
        return this;
    }
    public LoginPage enterEmail(String email){
        $(By.xpath(EMAIL_IMPUT)).sendKeys(email);
        return this;
    }
    public LoginPage enterPassword(String password){
        $(By.xpath(PASSWORD_IMPUT)).sendKeys(password);
        return this;
    }
   public  void clikLoginButton(){
       $(By.xpath(LOGIN_BUTTON)).click();
   }

public FeedGlobalPage login(User user) {
    enterEmail(user.getUserEmail());
    enterPassword(user.getUserPassword());
    clikLoginButton();
    return new FeedGlobalPage();
}
}



