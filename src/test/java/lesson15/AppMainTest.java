package lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppMainTest {
    @Test
    public void testSelenium() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        Thread.sleep(3000);

        textBox.sendKeys("Selenium");
        submitButton.click();
        Thread.sleep(3000);

        WebElement message = driver.findElement(By.id("message"));
        Assert.assertEquals(message.getText(), "Received!");

        Thread.sleep(3000);

        driver.quit();
    }

    @Test
    public void testGoogle() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement comboBox = driver.findElement(By.xpath("/html/body/ntp-app//div/ntp-realbox//div/input"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        comboBox.sendKeys();
        submitButton.click();



        driver.quit();
    }
}
