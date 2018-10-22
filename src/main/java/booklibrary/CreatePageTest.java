package booklibrary;


import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CreatePageTest extends FunctionalTest {

    @Test
    public void createBook(){
        driver.get("https://raamatukogu.herokuapp.com/catalog/book/create");
        CreatePage createPage = new CreatePage(driver);
        assertTrue(createPage.isInitialized());

        createPage.enterTitle("Minu Raamat");
        createPage.enterSummary("Minu kokkuvõte");
        createPage.enterISBN("ISBN15");
        createPage.chooseAuthor("Gladwell, Malcolm");
        createPage.tickCheckBox();
        createPage.submitBtn();

       // ReceiptPage receiptPage = CreatePage.submit();
        //assertTrue(receiptPage.isInitialized());

        //assertEquals("Thank you", receiptPage.confirmationHeader());
    }

    @Test
    public void checkBook(){
        driver.get("https://raamatukogu.herokuapp.com/catalog/book/create");
        BookPage book = new BookPage(driver);
        assertTrue(book.isInitialized());
    }
}