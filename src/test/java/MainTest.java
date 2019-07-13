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

        homePage.accessHomePage()
                .insertEnderecoOuCep("50710-485")
                .selectPromocional()
                .buscar();

//        driver.quit();

    }
}
