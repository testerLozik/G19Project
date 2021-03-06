package mainPack;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;

public class InvalidLogOn {
    WebDriver driver = new FirefoxDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Test
    public void setUp() {
        loginPage.openBrowserAndLoginPage();
        loginPage.enterUsername("Student");
        loginPage.enterPassword("906090");
        loginPage.clickButtonVhod();

        Assert.assertTrue(loginPage.isFormLoginInPresent());


    }

    @After
    public void tearDown() {
        loginPage.closeLoginPageAndBrowserBrowser();
    }
}
