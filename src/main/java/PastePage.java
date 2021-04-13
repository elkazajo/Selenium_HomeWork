import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PastePage extends AbstractPage {

    @FindBy (xpath = "//*[@id=\"select2-postform-expiration-container\"]")
    private WebElement dropdownMenu;

    @FindBy (xpath = "//li[text()=\"10 Minutes\"]")
    private WebElement tenMinutesOption;

    @FindBy (xpath = "//textarea[@id=\"postform-text\"]")
    private WebElement inputNewPaste;

    @FindBy (xpath = "//input[@id=\"postform-name\"]")
    private WebElement inputPasteName;

    @FindBy (xpath = "//*[@class=\"btn -big\"]")
    private WebElement createNewPasteButton;

    protected PastePage(WebDriver driver) {
        super(driver);
    }

    public PastePage inputNewPasteText() {
        inputNewPaste.sendKeys("Hello from WebDriver");
        return this;
    }

    public PastePage inputPasteName() {
        inputPasteName.sendKeys("helloweb");
        return this;
    }

    public PastePage dropdownMenu() {
        dropdownMenu.click();
        WaitUtility.waitForPresenceOfElement("//li[text()=\"10 Minutes\"]", this.driver);
        tenMinutesOption.click();
        return this;
    }

    public PastePage clickCreateNewPasteButton() {
        createNewPasteButton.click();
        return this;
    }
}
