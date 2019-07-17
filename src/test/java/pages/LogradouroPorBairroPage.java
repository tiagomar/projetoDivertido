package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class LogradouroPorBairroPage {

    private WebDriver driver;
    private String pageUrl = "http://www.buscacep.correios.com.br/sistemas/buscacep/buscaLogBairro.cfm";

    Select uf;

    public LogradouroPorBairroPage(WebDriver driver){
        this.driver = driver;
    }

    //Elements Locators
    By ufSelect = By.cssSelector("select[name='UF']");
    By localidadeHelpButton = By.cssSelector(".contentform span:nth-child(5) label a");
    By bairroHelpButton = By.cssSelector(".contentform span:nth-child(7) label a");
    By fisrtLetter = By.cssSelector("a");
    By firstRadioButton = By.cssSelector("input");
    By buscarButton = By.cssSelector("input[value='Buscar']");
    By inserirBairro = By.cssSelector("input[name='Bairro");

    //Actions
    public LogradouroPorBairroPage accessPage() {
        driver.get(pageUrl);
        return this;
    }

    public LogradouroPorBairroPage selectUf(String string) {
        uf = new Select(driver.findElement(ufSelect));
        uf.selectByValue(string);
        return this;
    }

    public LogradouroPorBairroPage informLocalidadeHelp() {
        driver.findElement(localidadeHelpButton).click();

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.findElement(fisrtLetter).click();
        driver.findElement(firstRadioButton).click();

        driver.switchTo().window(tabs.get(0));

        return this;
    }

    public LogradouroPorBairroPage informBairroHelp() {
        driver.findElement(bairroHelpButton ).click();

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.findElement(fisrtLetter).click();
        driver.findElement(firstRadioButton).click();

        driver.switchTo().window(tabs.get(0));

        return this;
    }

    public LogradouroPorBairroPage buscar() {
        driver.findElement(buscarButton).click();
        return this;
    }

    public void insertBairro(){
        driver.findElement(inserirBairro).sendKeys("berlim");
    }

}
