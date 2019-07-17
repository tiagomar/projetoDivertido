//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.HomePage;
//import pages.ResultPage;
//
//import java.util.List;
//
//public class MainTest {
//    WebDriver driver;
//
//    HomePage homePage;
//    ResultPage resultPage;
//
//
//
//    @Test
//    public void MainTest(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();
//
//        homePage = new HomePage(driver);
//        resultPage = new ResultPage(driver);
//
//
//        homePage.accessHomePage();
//
//        Alert alert = driver.switchTo().alert();
//
//        System.out.println(alert.getText());

//        System.out.println(resultPage.isInResults("Rua Conde da Boa Vista"));
//        System.out.println(resultPage.isInResults("conde da boa vista"));
//        System.out.println(resultPage.isInResults("maracutaia"));

//        System.out.println(resultPage.getResultMessage());
//        System.out.println(resultPage.getLogradouro());
//        System.out.println(resultPage.getBairro());
//        System.out.println(resultPage.getLocalUf());
//        System.out.println(resultPage.getCep());

//        driver.findElement(By.xpath("//a[contains(text(), 'Faixas de CEP')]")).click();

        //driver.quit();

//    }
//}
