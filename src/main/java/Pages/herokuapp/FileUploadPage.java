package Pages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputfield = By.id("file-upload");
    private By upload = By.id("file-submit");
    private By uploadedfile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String path) {
        driver.findElement(inputfield).sendKeys(path);
    }

    public void clickUploadBtn() {
        driver.findElement(upload).click();
    }

    public String getUploadedFile() {
        return driver.findElement(uploadedfile).getText();
    }
}
