import org.openqa.selenium.WebDriver;

public class MainTests {
    private static WebDriver driver;
    private static DriverSet driverSet;

    public static void main(String[] args) {
        driver = driverSet.getDriver();
    }

}
