package Gui;

import Base.BaseTests;
import Pages.herokuapp.FileUploadPage;
import Pages.herokuapp.LoadingPage;
import TestData.DataProviderClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GuiHerokuAppTests extends BaseTests {
    @Test(dataProvider = "FileUploadData", dataProviderClass = DataProviderClass.class, priority = 2)
    public void testFileUpload(String uploadedfilepath, String filename) throws Exception {
        homePage.navigateTo();
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile(System.getProperty("user.dir") + uploadedfilepath);
        fileUploadPage.clickUploadBtn();
        assertEquals(fileUploadPage.getUploadedFile(), filename);
    }

    @Test(dataProvider = "DynamicLoadingData", dataProviderClass = DataProviderClass.class, priority = 3)
    public void testDynamicLoading(String loadedtxt) throws Exception {
        homePage.navigateTo();
        LoadingPage loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), loadedtxt);
    }

}
