package pages;

import utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage extends PageObject {
    @FindBy(xpath="/html/body/div/div/div[2]/h1")
    private WebElement heading;


    public BookPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return heading.isDisplayed();
    }
}
