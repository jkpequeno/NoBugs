#language: pt
#enconding: utf-8

Funcionalidade: 

Cenário: Deve validar pesquisa de <produto>
	Dado que estou na tela de pesquisa do google
	Quando pesquiso por <produto>
	Então o título da página deve conter <resultadoPesquisa>
	
Exemplos:
|produto    |resultadoPesquisa            |
|"notebook" |"notebook - Pesquisa Google" |
|"geladeira"|"geladeira - Pesquisa Google"|
|"televisão"|"televisão - Pesquisa Google"|
|"celular"  |"celular - Pesquisa Google"  |