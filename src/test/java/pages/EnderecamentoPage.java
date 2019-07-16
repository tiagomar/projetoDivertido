package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnderecamentoPage {

         private WebDriver driver;

        public EnderecamentoPage(WebDriver driver){
            this.driver = driver;
        }

        //Elements Locators

        By segundaRecomendacao = By.cssSelector("p:nth-child(56) > em > strong");



        //Actions
        public String getSegundaRecomendacao() {
            return driver.findElement(segundaRecomendacao).getText();
        }

    }
