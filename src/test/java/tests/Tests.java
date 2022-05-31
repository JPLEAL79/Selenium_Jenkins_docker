package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {


    @Test
    public void testBuy() {

        String reptileName = "iguana";

        loginPage.Login(getProperty("emptyUser"),getProperty("emptyPass"));
        Assert.assertTrue(loginPage.at());
        loginPage.Login(getProperty("user"),getProperty("pass"));
        Assert.assertTrue(loginPage.ok());
        homePage.searchInTextBox(reptileName);
        Assert.assertTrue(homePage.at());


    }

}
