package Pages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadingPage {
    private WebDriver driver;
    private By startbtn = By.xpath("//button");
    private By loadedtxt = By.id("finish");

    public LoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart() {
        driver.findElement(startbtn).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedtxt));

    }

    public String getLoadedText() {
        return driver.findElement(loadedtxt).getText();
    }
}
