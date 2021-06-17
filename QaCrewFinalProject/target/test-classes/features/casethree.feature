# language: pt
# encoding: utf-8

Funcionalidade: Acessar a lista de carreiras da Accenture

Cenario: acessar o item de vagas de tecnologia
	Dado que o usuario esta no site da accenture
	Quando clicar no menu carreiras
	Quando clicar no item do menu vagas em tecnologia
	Então deve ver o destaque em Carreiras em Tecnologia
	
Cenario: pesquisar vaga de desenvolvedor
	Dado que o usuario esta no site da accenture
	Quando clicar no menu carreiras
	Quando clicar no item do menu procure por vagas
	E pesquisa por desenvolvedor no campo de busca
	E clicar no botao search
	Então deve ver a vaga de desenvolvedor
