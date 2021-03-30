import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSet {
    private static WebDriver driver;
    
    private static WebDriver createWebDriver() {
        if (driver != null) {
            DriverSet driverSet = new DriverSet();
            return driverSet.getDriver();
        } else {
            return driver = new ChromeDriver();
        }
    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = createWebDriver();
        }
        return driver;
    }
}
