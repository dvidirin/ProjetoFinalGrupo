# language: pt
# encoding: utf-8

Funcionalidade: Aceitar e configurar os cookies do LGPD

Cenario: deve aceitar o cookie LGPD
	Dado que o usuario esta no site da accenture
	Quando abre as configuracoes de cookies
	Quando clica em confirmar minhas escolhas
	Então deve fechar a caixa de informacao
	
Cenario: configuracoes de cookies
	Dado que o usuario esta no site da accenture
	Quando abre as configuracoes de cookies
	Então deve ver o item Sua privacidade
	Então deve ver o item Cookies estritamente necessarias
	Então deve ver o item Cookies Analiticos de Primeira Parte
	Então deve ver o item Cookies de Desempenho e Cookies Funcionais
	Então deve ver o item Cookies de Publicidade e Redes Sociais