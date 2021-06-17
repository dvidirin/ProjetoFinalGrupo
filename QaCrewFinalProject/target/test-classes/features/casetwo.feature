# language: pt
# encoding: utf-8

Funcionalidade: Acessar o site da Accenture e mostrar a lista de servicos

Cenario: exibir a lista de servicos
	Dado que o usuario esta no site da accenture
	Quando clica no item servicos
	Então deve mostrar os <itens>

Exemplos:
|itens|
|"Accenture Strategy"|
|"Application Services"|
|"Artificial Intelligence"|
|"Automation"|
|"Business Process Services"|
|"Change Management"|
|"Cloud"|
|"Customer Experience"|
|"Data & Analytics"|
|"Ecosystem Partners"|
|"Finance Consulting"|
|"Industry X"|
|"Infrastructure"|
|"Marketing"|
|"Mergers & Acquisitions (M&A)"|
|"Operating Models"|
|"Security"|
|"Supply Chain Management"|
|"Sustainability"|
|"Technology Consulting"|
|"Technology Innovation"|
|"Zero Based Budgeting (ZBB)"|

Cenario: clicar no servicos de cloud
	Dado que o usuario esta no site da accenture
	Quando clica no item servicos
	Quando clica no item do menu cloud
	Então deve encontrar o titulo servicos de cloud