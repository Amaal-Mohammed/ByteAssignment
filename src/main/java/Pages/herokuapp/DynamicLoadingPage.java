package Pages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoadingPage clickExample2() {
        driver.findElement(link_Example2).click();
        return new LoadingPage(driver);
    }

}
