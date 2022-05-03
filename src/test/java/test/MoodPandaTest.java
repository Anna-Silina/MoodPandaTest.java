package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodPandaTest extends BastTest {
    private String rating = "9";
    private String patronsubscriber;


    @Test
    public void moodTest() {
        User user= new User();
        dashboardPage =loginPage.openLoginPage()
                .login(user)
                .clickYorDashboarLink()
                .setuprating(rating)
                .clickUpdateButton();
        Assert.assertTrue(dashboardPage.isSuccessMessaDisplayed());
    }
    @Test
    public void findoutMoreTest(){
        patronsubscriberPage =  patronsubscriberPage.clickYorPatronsubscriberLink()
                        .clickYorPatronsubscriberLink();

       Assert.assertTrue(patronsubscriberPage.isSuccessMessaDisplayed());
    }

}
