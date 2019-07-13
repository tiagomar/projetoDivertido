package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    private WebDriver driver;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        this.driver = new ChromeDriver();
    }

    @After
    public void afterScenario() {
        driver.quit();
    }

    @Given("que estou na pagina de Busca CEP")
    public void que_estou_na_pagina_de_Busca_CEP() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("eu clico em {string}")
    public void eu_clico_em(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("eu informo o ")
    public void eu_informo_o() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("clico em buscar")
    public void clico_em_buscar() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("será apresentado o ")
    public void será_apresentado_o() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("eu informo o  invalido")
    public void eu_informo_o_invalido() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("no combo CEP de seleciodo {string}")
    public void no_combo_CEP_de_seleciodo(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("será retornado erro")
    public void será_retornado_erro() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("informo o nome do logradouro com erro de digitação: {string}")
    public void informo_o_nome_do_logradouro_com_erro_de_digitação(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("escolho a busca por nomes parecidos")
    public void escolho_a_busca_por_nomes_parecidos() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("o nome correto do logradouro \\({string}) aparece nos resultados")
    public void o_nome_correto_do_logradouro_aparece_nos_resultados(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("eu vejo se a segunda recomendação é {string}")
    public void eu_vejo_se_a_segunda_recomendação_é(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Página principal aberta")
    public void página_principal_aberta() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Escolhe opção Cep por localidade\\/logradouro")
    public void escolhe_opção_Cep_por_localidade_logradouro() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Informa apenas os dados obrigatórios")
    public void informa_apenas_os_dados_obrigatórios() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Será retornado as informações de endereço dos dados informados")
    public void será_retornado_as_informações_de_endereço_dos_dados_informados() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Página principal Aberta")
    public void página_principal_Aberta() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("O usuário desejar alterar o contraste da página")
    public void o_usuário_desejar_alterar_o_contraste_da_página() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Clicar na opção {string}")
    public void clicar_na_opção(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("O site mudará a cor de exibição")
    public void o_site_mudará_a_cor_de_exibição() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("que estou na pagina inicial dos Correios.")
    public void que_estou_na_pagina_inicial_dos_Correios() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("eu informo o {string}")
    public void eu_informo_o(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("clico na lupa de buscar.")
    public void clico_na_lupa_de_buscar() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("será exibido o rastreamento.")
    public void será_exibido_o_rastreamento() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Que o usuário está na opção de logradouro por bairro")
    public void que_o_usuário_está_na_opção_de_logradouro_por_bairro() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Informar um bairo que não corresponde a localidade e UF")
    public void informar_um_bairo_que_não_corresponde_a_localidade_e_UF() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("O bairro não será encontrado")
    public void o_bairro_não_será_encontrado() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("eu vou em {string}")
    public void eu_vou_em(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("na busca de produtos eu escrevo {string}")
    public void na_busca_de_produtos_eu_escrevo(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("eu seleciono  a boneca")
    public void eu_seleciono_a_boneca() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("eu valido o preço dela.")
    public void eu_valido_o_preço_dela() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Usuário esteja na opção de caixa postal")
    public void usuário_esteja_na_opção_de_caixa_postal() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Após realizar uma pesquisa válida")
    public void após_realizar_uma_pesquisa_válida() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Selecionar opção de nova consulta")
    public void selecionar_opção_de_nova_consulta() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Será retornado para a tela de consulta")
    public void será_retornado_para_a_tela_de_consulta() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
