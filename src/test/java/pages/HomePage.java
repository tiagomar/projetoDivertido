package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    private WebDriver driver;
    private String pageUrl = "http://www.buscacep.correios.com.br/sistemas/buscacep/";

    Select tipoDeCep;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Elements Locators
    By enderecoOuCepInputText = By.cssSelector(".contentform input[name='relaxation']");
    By tipoDeCepSelect = By.cssSelector("select[name='tipoCEP']");
    By buscarButton = By.cssSelector("input[value='Buscar']");
    By faixasDeCepLink = By.xpath("//a[contains(text(), 'Faixas de CEP')]");

    //Actions
    public HomePage accessHomePage() {
        driver.get(pageUrl);
        return this;
    }

    public void accessFaixadeCEP() {
        driver.findElement(faixasDeCepLink).click();
    }

    public HomePage insertEnderecoOuCep(String enderecoOuCep) {
        driver.findElement(enderecoOuCepInputText).sendKeys(enderecoOuCep);
        return this;
    }

    public HomePage selectLocalidadeLogradouro() {
        tipoDeCep = new Select(driver.findElement(tipoDeCepSelect));
        tipoDeCep.selectByValue("LOG");
        return this;
    }
    public HomePage selectPromocional() {
        tipoDeCep = new Select(driver.findElement(tipoDeCepSelect));
        tipoDeCep.selectByValue("PRO");
        return this;
    }
    public HomePage selectPostalComunitaria() {
        tipoDeCep = new Select(driver.findElement(tipoDeCepSelect));
        tipoDeCep.selectByValue("CPC");
        return this;
    }
    public HomePage selectUsuario() {
        tipoDeCep = new Select(driver.findElement(tipoDeCepSelect));
        tipoDeCep.selectByValue("GRU");
        return this;
    }
    public HomePage selectOperacional() {
        tipoDeCep = new Select(driver.findElement(tipoDeCepSelect));
        tipoDeCep.selectByValue("UOP");
        return this;
    }
    public HomePage selectTodos() {
        tipoDeCep = new Select(driver.findElement(tipoDeCepSelect));
        tipoDeCep.selectByValue("ALL");
        return this;
    }

    public HomePage buscar() {
        driver.findElement(buscarButton).click();
        return this;
    }

}
