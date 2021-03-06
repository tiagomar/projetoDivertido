package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPage {

    private WebDriver driver;
    private Class previousPage;
    private String pageUrl = "http://www.buscacep.correios.com.br/sistemas/buscacep/";

    public ResultPage(WebDriver driver){
        this.driver = driver;
    }

    //Elements Locators
    By resultMessage = By.cssSelector(".ctrlcontent p");
    By logradouroResult = By.cssSelector("#Geral+table tr:last-child :nth-child(1)");
    By bairroResult = By.cssSelector("#Geral+table tr:last-child :nth-child(2)");
    By localUfResult = By.cssSelector("#Geral+table tr:last-child :nth-child(3)");
    By cepResult = By.cssSelector("#Geral+table tr:last-child :nth-child(4)");
    By logradouroNaoEncontrado = By.cssSelector("p");
    By novaConsultaLink = By.xpath("//a[contains(text(), '[ Nova Consulta ]')]");

    //Actions
    public String getResultMessage() {
        return driver.findElement(resultMessage).getText().trim();
    }

    public String getLogradouro() {
        return driver.findElement(logradouroResult).getText().trim();
    }

    public String getBairro() {
        return driver.findElement(bairroResult).getText().trim();
    }

    public String getLocalUf() {
        return driver.findElement(localUfResult).getText().trim();
    }

    public String getCep() {
        return driver.findElement(cepResult).getText().trim();
    }

    public boolean isInResults(String desiredText) {
        String desiredXpath = "\"//td[contains(text(), \'" + desiredText + "\')]\"";
        List<WebElement> resultsList = driver.findElements(By.xpath("//td[contains(text(), \'" + desiredText + "\')]"));
        return !resultsList.isEmpty();
    }

    public String getLogradouroNaoEncontrado(){
        return driver.findElement(logradouroNaoEncontrado).getText().trim();
    }

    public void novaConsulta() {
        driver.findElement(novaConsultaLink).click();
    }
}
