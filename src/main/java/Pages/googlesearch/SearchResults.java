package Pages.googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResults {
    private WebDriver driver;
    private Boolean isthere = Boolean.FALSE;
    private By recaptchframe= By.xpath("//iframe[@title='reCAPTCHA']");
    private By recaptcha= By.xpath("//span[@id=\"recaptcha-anchor\"]/div");

    public SearchResults(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isResult(String searchresult) throws Exception {
        try {
            isReCaptcha();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'" + searchresult + "')]")));
            isthere = driver.findElement(By.xpath("//span[contains(text(),'" + searchresult + "')]")).isDisplayed();

        } catch (Exception e) {

            throw new Exception(e.toString());
        }
        return isthere;
    }

    private void isReCaptcha(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        if(!driver.findElements(recaptchframe).isEmpty()) {
            wait.until(ExpectedConditions.presenceOfElementLocated(recaptchframe));
            driver.switchTo().frame(driver.findElement(recaptchframe));
            driver.findElement(recaptcha).click();
        }
        driver.switchTo().defaultContent();

    }
}
