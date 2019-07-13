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

Scenario Outline: Buscar por logradouro com erros de digitação
  Given que estou na pagina de Busca CEP
  When informo o nome do logradouro com erro de digitação: "<wrong_address>"
  And escolho a busca por nomes parecidos
  And clico em buscar
  Then o nome correto do logradouro ("<correct_address>") aparece nos resultados

  Examples:
  | wrong_address | correct_address    |
  | code boa vita | conde da boa vista |


Scenario: Validar segunda recomendação de endereçamento de envelope
  Given que estou na pagina de Busca CEP
  When eu clico em "Formas de Endereçamento"
  Then eu vejo se a segunda recomendação é "não sublinhar e não colocar ponto entre os algarismos;"


Scenario: Pesquisa CEP por localidade/Logradouro utilizando apenas os campos obrigatórios
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

Scenario: Realizar a pesquisa de logradouro por bairro com informação inválidas
  Given Que o usuário está na opção de logradouro por bairro
  When Informar um bairo que não corresponde a localidade e UF
  Then O bairro não será encontrado

Scenario: Realizar compra no carrinho dos Correios
  Given que estou na pagina inicial dos Correios.
  When eu vou em "Loja Virtual"
  And na busca de produtos eu escrevo "Boneca Carteirinha Negra"
  And eu clico em "Buscar"
  And eu seleciono  a boneca
  Then eu valido o preço dela.

Scenario: validar a opção de retorno após consulta
  Given Usuário esteja na opção de caixa postal
  When Após realizar uma pesquisa válida
  And Selecionar opção de nova consulta
  Then Será retornado para a tela de consulta