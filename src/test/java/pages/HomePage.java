package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private String pageUrl = "http://www.buscacep.correios.com.br/sistemas/buscacep/";

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
}
