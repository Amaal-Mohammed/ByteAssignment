package Pages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private WebDriver driver;
    private By fileupload = By.linkText("File Upload");
    private By dynamicloading = By.linkText("Dynamic Loading");

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public FileUploadPage clickFileUpload() {
        driver.findElement(fileupload).click();
        return new FileUploadPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        driver.findElement(dynamicloading).click();
        return new DynamicLoadingPage(driver);
    }

    public void navigateTo() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }
}
