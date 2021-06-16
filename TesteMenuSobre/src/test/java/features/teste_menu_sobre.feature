# language: pt
# encoding: utf-8

Funcionalidade: Teste menu Sobre a Accenture

Cenário: Ver as características da accenture
Dado que eu estou no site da accenture
E clico no menu sobre a accenture
E clico no item do menu sobre a accenture
Então devo ver o destaque em <tituloDestaque>
	
Exemplos:
|tituloDestaque    |
|"Nosso propósito:"|