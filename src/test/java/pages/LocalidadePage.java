package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocalidadePage {

    private WebDriver driver;

    public LocalidadePage(WebDriver driver){
        this.driver = driver;
    }

    //Elements Locators
    By localidadeInput = By.cssSelector("input[name='Localidade']");
    By logradouroInput = By.cssSelector("input[name='Logradouro']");
    By buscarButton = By.cssSelector("input[value='Buscar']");

    //Actions
    public LocalidadePage informarLocalidade(String localidade) {
        driver.findElement(localidadeInput).sendKeys(localidade);
        return this;
    }

    public LocalidadePage informarLogradouro(String logradouro) {
        driver.findElement(logradouroInput).sendKeys(logradouro);
        return this;
    }

    public ResultPage buscar() {
        driver.findElement(buscarButton).click();
        return new ResultPage(driver);
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText().trim();
    }
}
