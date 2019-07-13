# new feature
# Tags: optional

Feature: Busca CEP

Scenario Outline: Realizar busca CEP com sucesso.
  Given que estou na pagina de Busca CEP
  When eu clico em "CEP ou endereço"
  And eu informo o <cep>
  And clico em buscar
  Then será apresentado o <endereço>
  Examples:
  |cep    |endereço                   |
  |       |                           |


Scenario Outline: Realizar busca CEP com falha.
  Given que estou na pagina de Busca CEP
  When eu informo o <cep> invalido
  And no combo CEP de seleciodo "Todos"
  And clico em buscar
  Then será retornado erro
  Examples:
  |cep    |
  |       |


Scenario: Validar segunda recomendação de endereçamento de envelope
  Given que estou na pagina de Busca CEP
  When eu clico em "Formas de Endereçamento"
  Then eu vejo se a segunda recomendação é "não sublinhar e não colocar ponto entre os algarismos;"


Scenario: Funcionalidade: Pesquisa CEP por localidade/Logradouro utilizando apenas os campos obrigatórios
  Given Página principal aberta
  When Escolhe opção Cep por localidade/logradouro
  And Informa apenas os dados obrigatórios
  Then Será retornado as informações de endereço dos dados informados

Scenario: Alterar o contraste do site
  Given Página principal Aberta
  When O usuário desejar alterar o contraste da página
  And Clicar na opção "contraste"
  Then O site mudará a cor de exibição

Scenario: Realizar rastreamento de objeto pela tela inicial dos Correios.
 Given que estou na pagina inicial dos Correios.
 When eu informo o "rastreio"
 And clico na lupa de buscar.
 Then será exibido o rastreamento.