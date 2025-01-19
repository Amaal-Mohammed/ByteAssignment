package TestData;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "SearchData")
    public Object[][] getSearchDataFromDataprovider() {
        return new Object[][]
                {
                        {"selenium webdriver", "What is Selenium WebDriver"},
                };
    }

    @DataProvider(name = "FileUploadData")
    public Object[][] getFileUploadDataFromDataprovider() {
        return new Object[][]
                {
                        {"\\src\\test\\java\\testdata\\flowers.png", "flowers.png"},
                };
    }

    @DataProvider(name = "DynamicLoadingData")
    public Object[][] getDynamicLoadingDataFromDataprovider() {
        return new Object[][]
                {
                        {"Hello World!"},
                };
    }

    @DataProvider(name = "ApiCatfacts")
    public Object[][] getCatFactData() {
        return new Object[][]
                {
                        {"cat", "1"},
                };
    }


}