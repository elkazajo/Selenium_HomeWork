import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MainTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSet.getDriver();
        driver.get("https://pastebin.com/");

        String newPasteId = "postform-text";
        String newPasteText = "Hello from WebDriver";
        String pasteNameTitleId = "postform-name";
        String pasteNameTitleText = "helloweb";
        String createNewPasteButton = "//*[@class=\"btn -big\"]";

        Interactions interactions = new Interactions(driver);

        interactions.inputText(newPasteId, newPasteText);
        interactions.inputText(pasteNameTitleId, pasteNameTitleText);

        interactions.dropdownMenu();
        interactions.clickElement(createNewPasteButton);

        DriverSet.shutDownDriver();
    }
}
