# new feature
# Tags: optional

Feature: Busca CEP

  #OK
Scenario Outline: Realizar busca CEP com sucesso.
  Given que estou na pagina de Busca CEP
  And eu informo o cep "<cep>"
  And clico em buscar
  Then será apresentado o "<logradouro>" "<bairro>" "<local_UF>" "<cep>"

  Examples:
  | cep       | logradouro         | bairro | local_UF  |
  | 50030-310 | Avenida Rio Branco | Recife | Recife/PE |

#OK
Scenario: Realizar busca CEP com falha.c
  Given que estou na pagina de Busca CEP
  When eu informo o CEP invalido "555555"
  And clico em buscar
  Then será retornado o erro "DADOS NAO ENCONTRADOS"

#OK
Scenario Outline: Buscar por logradouro com erros de digitação
  Given que estou na pagina de Busca CEP
  When informo o nome do logradouro com erro de digitação: "<wrong_address>"
  And escolho a busca por nomes parecidos
  And clico em buscar
  Then o nome correto do logradouro aparece nos resultados: "<correct_address>"

  Examples:
  | wrong_address | correct_address    |
  | code boa vita | Conde da Boa Vista |


#######Scenario: Validar segunda recomendação de endereçamento de envelope
#  Given que estou na pagina de Busca CEP
#  When eu clico em "Formas de Endereçamento"
#  Then eu vejo se a segunda recomendação é "não sublinhar e não colocar ponto entre os algarismos;"
#

#OK
Scenario: Pesquisa CEP por localidade/Logradouro sem informar um dos campos obrigatórios
  Given que estou na pagina de Busca CEP
  When escolho opção Cep por localidade/logradouro
  And não informo a UF
  And informo "Recife" como localidade
  And informo "Rosa e Silva" como logradouro
  When clico em buscar
  Then um alerta diz "Selecione a UF !"

#OK
Scenario: Alterar o contraste do site
  Given que estou na pagina de Busca CEP
  When o usuário clica na opção Contraste
  Then o site é exibido em modo de alto contraste
#
############Scenario: Realizar rastreamento de objeto pela tela inicial dos Correios.
# Given que estou na pagina inicial dos Correios.
# When eu informo o "rastreio"
# And clico na lupa de buscar.
# Then será exibido o rastreamento.
#
# OK
Scenario: Inserir dados na busca de logradouro por bairro utilizando botões de ajuda
  Given que estou na pagina de Busca de logradouro por bairro
  And informo "PE" como UF
  And informo localidade através do botão de ajuda
  And informo bairro através do botão de ajuda
  When clico em buscar
  Then vejo mensagem dizendo "DADOS ENCONTRADOS COM SUCESSO."

#Scenario: Realizar a pesquisa de logradouro por bairro com informação inválidas
#  Given que estou na pagina de Busca de logradouro por bairro
#  When Informar um bairo que não corresponde a localidade e UF
#  Then O bairro não será encontrado
#
#Scenario: Realizar compra no carrinho dos Correios
#  Given que estou na pagina inicial dos Correios.
#  When eu vou em "Loja Virtual"
#  And na busca de produtos eu escrevo "Boneca Carteirinha Negra"
#  And eu clico em "Buscar"
#  And eu seleciono  a boneca
#  Then eu valido o preço dela.
#
#Scenario: validar a opção de retorno após consulta
#  Given Usuário esteja na opção de caixa postal
#  When Após realizar uma pesquisa válida
#  And Selecionar opção de nova consulta
#  Then Será retornado para a tela de consulta