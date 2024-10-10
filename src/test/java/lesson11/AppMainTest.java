package lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AppMainTest {
    private WebDriver driver;

    public void testGoogleHomePage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.google.com");
        assertEquals(driver.getTitle(), "Google");
        System.out.println(driver.toString());
        if (this.driver != null) {
            this.driver.quit();
        }
    }

    @Test
    public void test() {
        testGoogleHomePage(new ChromeDriver());
        testGoogleHomePage(new EdgeDriver());
    }

}
