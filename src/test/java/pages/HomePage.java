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
    By cepPorLocalidadeLink = By.xpath("//a[contains(text(), 'CEP por Localidade | Logradouro')]");
    By faixasDeCepLink = By.xpath("//a[contains(text(), 'Faixas de CEP')]");
    By maisOpcoesLink = By.cssSelector(".contentform > .f8col a");
    By palavrasSemelhantesSimRadio = By.cssSelector("input[value='S']");
    By contrastLink = By.cssSelector("#contrast a");
    By biggerFontButton = By.cssSelector("#biggerFont");
    By smallerFontButton = By.cssSelector("#smallerFont");
    By defaultFontLink = By.cssSelector("#defaultFont");
    By minFont = By.cssSelector("body[style='font-size: 8px;']");
    By defaultFont = By.cssSelector("body[style='font-size: 10px;']");
    By maxFont = By.cssSelector("body[style='font-size: 12px;']");
    By formasEnderecamentoLink = By.cssSelector("li:nth-child(10)");

    //Actions
    public HomePage accessHomePage() {
        driver.get(pageUrl);
        return this;
    }

    public void accessCepPorLocalidade() {
        driver.findElement(cepPorLocalidadeLink).click();
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

    public HomePage selectPalavrasSemelhantes() {
        driver.findElement(maisOpcoesLink).click();
        driver.findElement(palavrasSemelhantesSimRadio).click();
        return this;
    }

    public ResultPage buscar() {
        driver.findElement(buscarButton).click();
        return new ResultPage(driver);
    }

    public HomePage alternateContrast() {
        driver.findElement(contrastLink).click();
        return this;
    }

    public boolean isContrastModeON() {
        return !driver.findElements(By.cssSelector("body.contrast")).isEmpty();
    }

    public HomePage clickBiggerFont() {
        driver.findElement(biggerFontButton).click();
        return this;
    }

    public HomePage clickSmallerFont() {
        driver.findElement(smallerFontButton).click();
        return this;
    }

    public HomePage clickDefaultFont() {
        driver.findElement(defaultFontLink).click();
        return this;
    }

    public  HomePage clickFormasEnderecamento() {
        driver.findElement(formasEnderecamentoLink).click();
        return  this;
    }

    public boolean isMinFont() {
        return !driver.findElements(minFont).isEmpty();
    }

    public boolean isMaxFont() {
        return !driver.findElements(maxFont).isEmpty();
    }

    public boolean isDefaultFont() {
        return !driver.findElements(defaultFont).isEmpty();
    }

}
