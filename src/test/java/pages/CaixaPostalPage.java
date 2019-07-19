package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CaixaPostalPage {

    private WebDriver driver;
    private String pageUrl = "http://www.buscacep.correios.com.br/sistemas/buscacep/buscaCaixaPostal.cfm";

    Select uf;

    public CaixaPostalPage(WebDriver driver){
        this.driver = driver;
    }

    //Elements Locators
    By ufSelect = By.cssSelector("select[name='UF']");
    By localidadeInput = By.cssSelector("input[name='Localidade']");
    By buscarButton = By.cssSelector("input[value='Buscar']");
    By caixaPostalInput = By.cssSelector("input[name='Numero']");

    //Actions
    public CaixaPostalPage accessPage() {
        driver.get(pageUrl);
        return this;
    }

    public CaixaPostalPage selectUf(String string) {
        uf = new Select(driver.findElement(ufSelect));
        uf.selectByValue(string);
        return this;
    }

    public CaixaPostalPage informarLocalidade(String localidade) {
        driver.findElement(localidadeInput).sendKeys(localidade);
        return this;
    }

    public CaixaPostalPage informarCaixaPostal(String caixaPostal) {
        driver.findElement(caixaPostalInput).sendKeys(caixaPostal);
        return this;
    }

    public ResultPage buscar() {
        driver.findElement(buscarButton).click();
        return new ResultPage(driver);
    }


}
