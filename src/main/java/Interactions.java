import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Interactions {
    private final WebDriver driver;

    public Interactions(WebDriver driver) {
        this.driver = driver;
    }

    public void inputText(String id, String text) {
        driver.findElement(By.id(id)).sendKeys(text);
    }

    public void clickElement(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public void dropdownMenu() {
        clickElement("//*[@id=\"select2-postform-expiration-container\"]");
        WaitUtility.waitForPresenceOfElement("//li[text()=\"10 Minutes\"]");
        clickElement("//li[text()=\"10 Minutes\"]");
    }
}
