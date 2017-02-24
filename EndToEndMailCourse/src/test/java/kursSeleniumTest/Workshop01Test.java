package kursSeleniumTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertNotNull;


/**
 * Created by katar on 17.02.2017.
 */

public class Workshop01Test {
    private String testUrl = "https://suvroc.github.io/selenium-mail-course/01/workshop.html";

    @Test
    public void ShouldTestFirstName() {
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to(testUrl);
        String value = "";
        WebElement element = null;

        // #region TEST CODE
        element = driver.findElementByName("firstName");
        value = element.getAttribute("value");

        //  #endregion

        assertNotNull(element);
        assertTrue(element instanceof WebElement);
        assertEquals(value, "Terry");

        driver.quit();
    }

    @Test
    public void ShouldTestLastName() {
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to(testUrl);
        String value = "";
        WebElement element = null;

        //  #region TEST CODE

        element = driver.findElementByName("lastName");
        value = element.getAttribute("value");
        //   #endregion

        assertNotNull(element);
        assertTrue(element instanceof WebElement);
        assertEquals(value, "Pratchett");

        driver.quit();
    }

    @Test
    public void ShouldTestCountry() {
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to(testUrl);
        String value = "";
        WebElement element = null;

        //   #region TEST CODE
        element = driver.findElementByName("country");
        value = element.getAttribute("value");

        //   #endregion

        assertNotNull(element);
        assertTrue(element instanceof WebElement);
        assertEquals(value, "England");

        driver.quit();
    }

    @Test
    public void ShouldTestActiveCheckbox() {
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to(testUrl);
        boolean value = true;
        WebElement element = null;
        //   #region TEST CODE

        element = driver.findElementById("isActive");
        value = element.isSelected();


        //  #endregion

        assertNotNull(element);
        assertTrue(element instanceof WebElement);
        assertEquals(element.isEnabled(), false);
        assertEquals(value, false);

        driver.quit();
    }

    @Test
    public void ShouldTestCommentInput() {
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to(testUrl);
        String value = "";
        WebElement element = null;

        //  #region TEST CODE
        element = driver.findElementById("commentInput");
        value = element.getText();
        // #endregion

        assertNotNull(element);
        assertTrue(element instanceof WebElement);
        assertEquals(value, "");

        driver.quit();
    }

    @Test
    public void ShouldTestDetailsLink() {
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to(testUrl);
        WebElement element = null;

        //    #region TEST CODE

        element = driver.findElementByLinkText("Details");

        //     #endregion

        assertNotNull(element);
        assertTrue(element instanceof WebElement);
        assertEquals(element.getAttribute("href"), "https://en.wikipedia.org/wiki/Terry_Pratchett");

        driver.quit();
    }

    @Test
    public void ShouldTestListOfBooksLink() {
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to(testUrl);
        WebElement element = null;

        //    #region TEST CODE
        element=driver.findElementByLinkText("List of books");
        //   #endregion

        assertNotNull(element);
        assertTrue(element instanceof WebElement);
        assertEquals(element.getAttribute("href"), "https://www.terrypratchettbooks.com/books/");

        driver.quit();
    }
}


