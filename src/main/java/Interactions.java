import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Interactions {
    private final WebDriver driver;
    private final By dropdown = By.id("postform-expiration");

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
        WebElement element = driver.findElement(dropdown);
        Select select = new Select(element);
        select.selectByIndex(2);
    }
}
