import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSet {
    private static WebDriver driver;
    
    private static void createWebDriver() {        
        if (driver != null) {
            DriverSet driverSet = new DriverSet();
            driverSet.getDriver();
        } else {
            driver = new ChromeDriver();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
