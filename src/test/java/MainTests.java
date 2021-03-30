import org.openqa.selenium.WebDriver;

public class MainTests {
    public static void main(String[] args) {
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

        driver.quit();
    }
}
