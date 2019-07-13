import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class MainTest {
    WebDriver driver;

    HomePage homePage;



    @Test
    public void MainTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        homePage = new HomePage(driver);

        homePage.accessHomePage();

        driver.findElement(By.xpath("//a[contains(text(), 'Faixas de CEP')]")).click();

//        driver.quit();

    }
}
