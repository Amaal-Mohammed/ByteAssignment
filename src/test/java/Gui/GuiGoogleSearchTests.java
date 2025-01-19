package Gui;

import Base.BaseTests;
import Pages.googlesearch.SearchResults;
import TestData.DataProviderClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GuiGoogleSearchTests extends BaseTests {
    @Test(dataProvider = "SearchData", dataProviderClass = DataProviderClass.class, priority = 1)
    public void testSearchGoogle(String search, String result) throws Exception {
        googleSearch.searchForItem(search);
        SearchResults searchResults = googleSearch.clickSearchBtn();
        assertTrue(searchResults.isResult(result), "Result is not displayed");
    }


}
