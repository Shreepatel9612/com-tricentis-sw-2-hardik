package testsuite;
/**
 * Write down the following test in the ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully()

 *  click on the ‘Login’ link
 *  Verify the text ‘Welcome, Please Sign
 * In!’

 * 2. userShouldLoginSuccessfullyWithValidCredentials()

 *  click on the ‘Login’ link
 *  Enter a valid username
 *  Enter a valid password
 *  Click on the ‘Login’ button
 *  Verify the ‘Welcome to our store’
 * text is displayed
 * 3. verifyTheErrorMessage()

 *  click on the ‘Login’ link
 *  Enter the invalid username
 *  Enter the invalid password
 *  Click on the ‘Login’ button
 *  Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        driver.findElement(By.linkText("Log in")).click();
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actualText, "Welcome, Please Sign In!");
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("shreepatel9612@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("ABC1234");
        driver.findElement(By.className("login-button")).click();
        String actualText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[2]/div[1]/h2")).getText();
        Assert.assertEquals(actualText, "Welcome to our store");
    }
    @Test
    public void verifyTheErrorMessage() {
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("shreepatel9612@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("ABC1234");
        driver.findElement(By.className("login-button")).click();
        String actualErrorMessage = driver.findElement(By.cssSelector("div.validation-summary-errors")).getText();
        Assert.assertTrue(actualErrorMessage.contains("Login was unsuccessful. Please correct the errors and try again"));
    }
    @After
    public void tearDown() {
        closeBrowser();


    }

}