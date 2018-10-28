 package tests;

import booklibrary.TestDataProvider;
import org.testng.annotations.Test;
import pages.BookPage;
import pages.CreatePage;
import utils.FunctionalTest;
import static org.testng.Assert.assertTrue;


 public class CreateBookTest extends FunctionalTest {

    @Test(dataProvider = "inputs", dataProviderClass = TestDataProvider.class)
    public void createBook(String title, String summary, String author, String isbn){

        driver.get("https://raamatukogu.herokuapp.com/catalog/book/create");
        CreatePage createPage = new CreatePage(driver);
        assertTrue(createPage.isInitialized());

        // Use methods to fill out book information
        createPage.enterTitle(title);
        createPage.enterSummary(summary);
        createPage.chooseAuthor(author);
        createPage.enterISBN(isbn);
        createPage.tickCheckBox();
        createPage.submitBtn();


        // Assuming that after book creation, the page loaded has bookId in it, lets get the bookId
        String bookId = CreatePage.getBookId();


        // Get the page where all books are listed. This should be added as a different test case or can be used as an
        // assertion for the creation of the book.
        driver.get("https://raamatukogu.herokuapp.com/catalog/books");
        BookPage bookPage = new BookPage(driver);
        bookPage.isInitialized();
        // Verify that the id of the book You created is present on the page. Better way to be to click the book link
        // and go to the details page to verify each of the parameters you used earlier exists in the book entity.
        assertTrue(driver.getPageSource().contains(bookId));


    }
/**  TODO: Find out a way to separate checking the existance of the book to a different test, using listners
 * to get parameter from one testcase to be used in another.
 *
    @Test(dependsOnMethods = "createBook")
    public void checkBook(){
        System.out.println("Finding the created book");
        driver.get("https://raamatukogu.herokuapp.com/catalog/books");
        BookPage bookPage = new BookPage(driver);
        bookPage.isInitialized();
        //TODO get bookId from the previous test
        String bookId = "5bd5d2fbaf6b4a0014082bd4";
        assertTrue(driver.getPageSource().contains(bookId));
    }

*/




}