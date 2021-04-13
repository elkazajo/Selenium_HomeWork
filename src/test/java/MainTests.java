import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MainTests {

    @Test
    public void test() {
        DriverSet driverSet = new DriverSet();
        WebDriver driver = driverSet.getDriver();
        driver.get("https://pastebin.com/");

        PastePage pastePage = new PastePage(driver);
        pastePage.inputNewPasteText().inputPasteName().dropdownMenu().clickCreateNewPasteButton();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }
}
