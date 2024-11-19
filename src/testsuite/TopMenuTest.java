package testsuite;
/**
 * Write down the following test in the ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully()

 *  click on the ‘COMPUTERS’ Tab
 *  Verify the text ‘Computers’

 * 2. userShouldNavigateToElectronicsPageSuccessfully()

 *  click on the ‘ELECTRONICS’ Tab
 *  Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelAndShoesPage
 * Successfully()
 *  click on the ‘APPAREL & SHOES’ Tab
 *  Verify the text ‘Apparel & Shoes’

 * 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully()
 *  click on the ‘DIGITAL DOWNLOADS’ Tab
 *  Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully()

 *  click on the ‘BOOKS’ Tab
 *  Verify the text ‘Books’

 * 6. userShouldNavigateToJewelryPageSuccessfully()

 *  click on the ‘JEWELRY’ Tab
 *  Verify the text ‘Jewelry’

 * 7. userShouldNavigateToGiftCardsPageSuccessfully()

 *  click on the ‘GIFT CARDS’ Tab
 *  Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.linkText("COMPUTERS")).click();
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actualText, "Computers");
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.linkText("ELECTRONICS")).click();
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actualText, "Electronics");
    }

    @Test
    public void userShouldNavigateToApparelAndShoesPageSuccessfully() {
        driver.findElement(By.linkText("APPAREL & SHOES")).click();
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actualText, "Apparel & Shoes");
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.linkText("DIGITAL DOWNLOADS")).click();
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actualText, "Digital downloads");
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.linkText("BOOKS")).click();
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actualText, "Books");
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.linkText("JEWELRY")).click();
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actualText, "Jewelry");
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.linkText("GIFT CARDS")).click();
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actualText, "Gift Cards");
    }
    @After
    public void tearDown() {
        closeBrowser();
    }

}