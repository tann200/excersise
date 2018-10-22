package booklibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage extends PageObject {
    @FindBy(id="title")
    private WebElement title;

    @FindBy(id="summary")
    private WebElement summary;

    @FindBy(id="author")
    private WebElement author;

    @FindBy(id="isbn")
    private WebElement isbn;

    @FindBy(id="5b6714c93809970014e31c9a")
    private WebElement checkBox;

    @FindBy(xpath="/html/body/div/div/div[2]/form/button")
    private WebElement submitButton;

    public BookPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return title.isDisplayed();
    }
}
