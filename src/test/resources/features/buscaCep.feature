# new feature
# Tags: optional
Feature: Busca CEP

  Scenario Outline: Realizar busca CEP com sucesso.
    Given que estou na pagina de Busca CEP
    When eu informo o cep "<cep>"
    And clico em buscar
    Then será apresentado o "<logradouro>" "<bairro>" "<local_UF>" "<cep>"

    Examples:
      | cep       | logradouro         | bairro | local_UF  |
      | 50030-310 | Avenida Rio Branco | Recife | Recife/PE |

  Scenario: Validar a opção de retorno após consulta
    Given Usuário esteja na de Busca Caixa Postal
    When realiza uma pesquisa válida
    And clica em Nova Consulta na página de resultados
    Then é redirecionado para a tela de Busca Caixa Postal

  Scenario: Realizar busca CEP com falha
    Given que estou na pagina de Busca CEP
    When eu informo o CEP invalido "555555"
    And clico em buscar
    Then será retornado o erro "DADOS NAO ENCONTRADOS"

  Scenario Outline: Buscar por logradouro com erros de digitação
    Given que estou na pagina de Busca CEP
    When informo o nome do logradouro com erro de digitação: "<wrong_address>"
    And escolho a busca por nomes parecidos
    And clico em buscar
    Then o nome correto do logradouro aparece nos resultados: "<correct_address>"

  Examples:
    | wrong_address | correct_address    |
    | code boa vita | Conde da Boa Vista |

  Scenario: Validar segunda recomendação de endereçamento de envelope
    Given que estou na pagina de Busca CEP
    When eu clico em Formas de Endereçamento
    Then eu vejo se a segunda recomendação é "não sublinhar e não colocar ponto entre os algarismos"

  Scenario: Pesquisa CEP por localidade/Logradouro sem informar um dos campos obrigatórios
    Given que estou na pagina de Busca CEP
    When escolho opção Cep por localidade/logradouro
    And não informo a UF
    And informo "Recife" como localidade
    And informo "Rosa e Silva" como logradouro
    And clico em buscar
    Then um alerta diz "Selecione a UF !"

  Scenario: Alterar o contraste do site
    Given que estou na pagina de Busca CEP
    When o usuário clica na opção Contraste
    Then o site é exibido em modo de alto contraste

  Scenario: Inserir dados na busca de logradouro por bairro utilizando botões de ajuda
    Given que estou na pagina de Busca de logradouro por bairro
    And informo "PE" como UF
    And informo localidade através do botão de ajuda
    And informo bairro através do botão de ajuda
    When clico em buscar
    Then vejo mensagem dizendo "DADOS ENCONTRADOS COM SUCESSO."

  Scenario: Realizar a pesquisa de logradouro por bairro com informação inválidas
    Given que estou na pagina de Busca de logradouro por bairro
    When Informar um bairo que não corresponde a localidade e UF
    Then O bairro não será encontrado validando mensagem - BAIRRO/LOGRADOURO NAO ENCONTRADO.

  Scenario: Ajustar tamanho da fonte para o máximo
    Given que estou na pagina de Busca CEP
    When eu clico duas vezes no botão de aumentar a fonte
    Then o tamanho da fonte será o máximo

  Scenario: Ajustar tamanho da fonte para o mínimo
    Given que estou na pagina de Busca CEP
    When eu clico duas vezes no botão de diminuir a fonte
    Then o tamanho da fonte será o mínimo

  Scenario: Ajustar tamanho da fonte para o padrão
    Given que estou na pagina de Busca CEP
    And fonte está em tamanho máximo
    When eu clico em Tamanho padrão
    Then o tamanho da fonte será redefinido para o padrão
