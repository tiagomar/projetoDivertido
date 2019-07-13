package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private String pageUrl = "http://www.buscacep.correios.com.br/sistemas/buscacep/";

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Elements Locators
    By enderecoOuCepInputText = By.cssSelector(".contentform input[name='relaxation']");

    //Actions
    public HomePage insertEnderecoOuCep(String enderecoOuCep) {
        driver.findElement(enderecoOuCepInputText).sendKeys(enderecoOuCep);
        return this;
    }


}
