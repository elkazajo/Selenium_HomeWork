import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility {
    private static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        WaitUtility.driver = driver;
    }

    public void waitUntilBeVisible(WebElement webElement, int timeOut) {
        Wait<WebDriver> wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilClickable(WebElement webElement, int timeOut) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitForPresenceOfElement(String xpath) {
        new WebDriverWait(DriverSet.getDriver(), 20)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public static WebElement getWebElement(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

}
