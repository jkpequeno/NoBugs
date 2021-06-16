# language: pt
# encoding: utf-8

Funcionalidade:  Acessar site o da accenture e aceitar os cookies do LGPD

Cenario: Aceitar o cookies LGPD
Dado que estou no site da accenture
E abro as configurações de cookies
E clico em Confirmar minhas escolhas
Então deve fechar o modal

Cenário: Configurações do cookie
Dado que estou no site da accenture
E abro as configurações de cookies
E clico em Confirmar minhas escolhas
E e clico em configurações de cookie
E devo ver o item de sua privacidade
E devo ver Cookies estritamente necessárias
E devo ver Cookies Analíticos de Primeira Parte
E devo ver Cookies de Desempenho e Cookies Funcionais
Então devo ver Cookies de Publicidade e Redes Sociais