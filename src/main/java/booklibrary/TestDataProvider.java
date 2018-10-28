package booklibrary;

import org.testng.annotations.DataProvider;


// The following class is used to be able to add testdata easily to the tests.
public class TestDataProvider {

    @DataProvider(name = "inputs")
    public Object[][] provideData() {

        return new Object[][]{
                {"Minu uus raamat", "Mingi kokkuvõte", "Gladwell, Malcolm", "ISBN16"}
        };
    }
}
