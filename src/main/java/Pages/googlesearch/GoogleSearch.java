package Pages.googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {
    private WebDriver driver;
    private By searchitem = By.tagName("textarea");
    private By searchbtn = By.xpath("//input[@value='Google Search']//preceding::input[2]");

    public GoogleSearch(WebDriver driver) {
        this.driver = driver;

    }

    public void searchForItem(String item) {
        driver.findElement(searchitem).sendKeys(item);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public SearchResults clickSearchBtn() {
        driver.findElement(searchbtn).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return new SearchResults(driver);
    }
}
