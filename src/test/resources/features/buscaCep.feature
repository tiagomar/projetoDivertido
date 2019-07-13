# new feature
# Tags: optional

Feature: Busca CEP

Scenario Outline: Realizar busca CEP com sucesso.
Given que estou na pagina de Busca CEP
When eu clico em "CEP ou endereço"
And eu informo o <cep>
And no combo CEP de seleciodo "Todos"
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