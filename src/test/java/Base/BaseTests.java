package Base;

import Pages.googlesearch.GoogleSearch;
import Pages.herokuapp.HomePage;
import TestData.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


public class BaseTests {
    protected GoogleSearch googleSearch;
    protected HomePage homePage;
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
        driver = new ChromeDriver();
        googleSearch = new GoogleSearch(driver);
        homePage = new HomePage(driver);
        driver.get(Constants.GOOGLEURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
