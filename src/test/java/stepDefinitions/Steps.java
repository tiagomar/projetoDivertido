package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LocalidadePage;
import pages.LogradouroPorBairroPage;
import pages.ResultPage;

public class Steps {
    private WebDriver driver;

    HomePage homePage;
    ResultPage resultPage;
    LocalidadePage localidadePage;
    LogradouroPorBairroPage logradouroPorBairroPage;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        this.driver = new ChromeDriver();

        homePage = new HomePage(driver);
        resultPage = new ResultPage(driver);
        localidadePage = new LocalidadePage(driver);
        logradouroPorBairroPage = new LogradouroPorBairroPage(driver);
    }

    @After
    public void afterScenario() {
        driver.quit();
    }

    @Given("que estou na pagina de Busca CEP")
    public void que_estou_na_pagina_de_Busca_CEP() {
        homePage.accessHomePage();
    }

    @Given("eu informo o cep {string}")
    public void eu_informo_o_cep(String cep) {
        homePage.insertEnderecoOuCep(cep);
    }

    @Given("clico em buscar")
    public void clico_em_buscar() {
        homePage.buscar();
    }

    @Then("será apresentado o {string} {string} {string} {string}")
    public void será_apresentado_o(String logradouro,String bairro,String local_UF,String cep) {
        Assert.assertEquals(resultPage.getLogradouro(), logradouro);
        Assert.assertEquals(resultPage.getBairro(), bairro);
        Assert.assertEquals(resultPage.getLocalUf(), local_UF);
        Assert.assertEquals(resultPage.getCep(), cep);
    }



    @When("eu informo o CEP invalido {string}")
    public void eu_informo_o_CEP_invalido(String cepInvalido) {
        homePage.insertEnderecoOuCep(cepInvalido);
    }

    @Then("será retornado o erro {string}")
    public void será_retornado_o_erro(String mensagem) {
        Assert.assertEquals(resultPage.getResultMessage(), mensagem);
    }



    @When("informo o nome do logradouro com erro de digitação: {string}")
    public void informo_o_nome_do_logradouro_com_erro_de_digitação(String string) {
        homePage.insertEnderecoOuCep(string);
    }

    @When("escolho a busca por nomes parecidos")
    public void escolho_a_busca_por_nomes_parecidos() {
        homePage.selectPalavrasSemelhantes();
    }

    @Then("o nome correto do logradouro aparece nos resultados: {string}")
    public void o_nome_correto_do_logradouro_aparece_nos_resultados(String string) {
        resultPage.isInResults(string);
    }



    @When("escolho opção Cep por localidade\\/logradouro")
    public void escolho_opção_Cep_por_localidade_logradouro() {
        homePage.accessCepPorLocalidade();
    }

    @When("não informo a UF")
    public void não_informo_a_UF() {
        // Do nothing
    }

    @When("informo {string} como localidade")
    public void informo_como_localidade(String string) {
        localidadePage.informarLocalidade(string);
    }

    @When("informo {string} como logradouro")
    public void informo_como_logradouro(String string) {
        localidadePage.informarLogradouro(string);
    }

    @Then("um alerta diz {string}")
    public void um_alerta_diz(String string) {
        Assert.assertEquals(localidadePage.getAlertText(), string);
    }




    @When("o usuário clica na opção Contraste")
    public void o_usuário_clica_na_opção_Contraste() {
        homePage.alternateContrast();
    }

    @Then("o site é exibido em modo de alto contraste")
    public void o_site_é_exibido_em_modo_de_alto_contraste() {
        Assert.assertTrue(homePage.isContrastModeON());
    }


    @Given("que estou na pagina de Busca de logradouro por bairro")
    public void que_estou_na_pagina_de_Busca_de_logradouro_por_bairro() {
        logradouroPorBairroPage.accessPage();
    }

    @Given("informo {string} como UF")
    public void informo_como_UF(String string) {
        logradouroPorBairroPage.selectUf(string);
    }

    @Given("informo localidade através do botão de ajuda")
    public void informo_localidade_através_do_botão_de_ajuda() {
        logradouroPorBairroPage.informLocalidadeHelp();
    }

    @Given("informo bairro através do botão de ajuda")
    public void informo_bairro_através_do_botão_de_ajuda() {
        logradouroPorBairroPage.informBairroHelp();
    }

    @Then("vejo mensagem dizendo {string}")
    public void vejo_mensagem_dizendo(String string) {
        Assert.assertEquals(resultPage.getResultMessage(), string);
        Assert.assertTrue(resultPage.isInResults("53515-250"));
    }






}
