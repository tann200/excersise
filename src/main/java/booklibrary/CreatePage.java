package booklibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreatePage extends PageObject {

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

    public CreatePage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return title.isDisplayed();
    }

    public void enterTitle(String title){
        this.title.clear();
        this.title.sendKeys(title);
    }

    public void enterSummary(String summary){
        this.summary.clear();
        this.summary.sendKeys(summary);
    }

     public void enterISBN(String isbn){
        this.isbn.clear();
        this.isbn.sendKeys(isbn);
    }

    public void chooseAuthor(String authorName){
        Select author = new Select(driver.findElement(By.id("author")));
        author.selectByVisibleText(authorName);
    }

    public void tickCheckBox(){
        this.checkBox.click();
    }

    public void submitBtn(){
        submitButton.click();
    }
}
