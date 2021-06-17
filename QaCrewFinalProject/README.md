# Projeto em Grupo QA Crew - Accenture 10 QE - Academia Gama

<b>Este projeto foi elaborado por:</b>
<ul>
<li>Camila Ribeiro Pinto https://github.com/camisarp</li>
<li>Cyntia Cybelle Lopes C. de Oliveira https://github.com/cyntialopes</li>
<li>Daniel Vidiri Neto https://github.com/dvidirin</li>
<li>Daniela Gonçalves do Rosário https://github.com/DanielaRosario</li>
<li>Daniela Martinez https://github.com/danizzo7</li>
<li>Danieli do Nascimento Baviera https://github.com/danibaviera</li>
<li>Samantha Bertozzi https://github.com/bert1307</li>
</ul>

# Descrição do desafio
### Criar uma aplicação Selenium com os seguintes casos de teste
### Caso de teste 1
Acessar o site da accenture, aceitar e configurar os cookies do LGPD<br>

<b>Cenario</b>: Aceitar o cookie LGPD<br>
Dado que o usuario esta no site da accenture<br>
Quando abre as configuracoes de cookies<br>
Quando clica em confirmar minhas escolhas<br>
Então deve fechar a caixa de informacao<br>

<b>Cenario</b>: Configuracoes do cookie<br>
Dado que o usuario esta no site da accenture<br>
Quando abre as configuracoes de cookies<br>
Então deve ver o item Sua privacidade<br>
Então deve ver o item Cookies estritamente necessarias<br>
Então deve ver o item Cookies Analiticos de Primeira Parte<br>
Então deve ver o item Cookies de Desempenho e Cookies Funcionais<br>
Então deve ver o item Cookies de Publicidade e Redes Sociais<br>

### Caso de teste 2
Acessar o site da accenture a mostrar a lista de serviços<br>

<b>Cenário</b>: listar serviços da Accenture<br>
Dado que o usuario esta no site da accenturee<br>
Quando clica no item servicos<br>
Então deve mostrar os itens<br>
- Accenture Strategy
- Application Services
- Artificial Intelligence
- Automation
- Business Process Services
- Change Management
- Cloud
- Customer Experience
- Data & Analytics
- Ecosystem Partners
- Finance Consulting
- Industry X
- Infrastructure
- Marketing
- Mergers & Acquisitions (M&A)
- Operating Models
- Security
- Supply Chain Management
- Sustainability
- Technology Consulting
- Technology Innovation
- Zero Based Budgeting (ZBB)

<b>Cenário</b>: Clicar no serviço de cloud<br>
Dado que o usuario esta no site da accenture<br>
Quando clica no item servicos<br>
Quando clica no item do menu cloud<br>
Então deve encontrar o titulo servicos de cloud<br>

### Caso de teste 3
Acessar a lista de carreiras da Accenture<br>

<b>Cenário</b>: Acessar o item de vagas de tecnologia<br>
Dado que o usuario esta no site da accenture<br>
Quando clicar no menu carreiras<br>
Quando clicar no item do menu vagas em tecnologia<br>
Então deve ver o destaque em Carreiras em Tecnologia<br>

<b>Cenário</b>: Acessar o item de vagas de tecnologia<br>
Dado que o usuario esta no site da accenture<br>
Quando clicar no menu carreiras<br>
Quando clicar no item do menu procure por vagas<br>
E pesquisa por desenvolvedor no campo de busca<br>
E clicar no botao search<br>
Então deve ver a vaga de desenvolvedor<br>

###  Caso de teste 4                     
Sobre a accenture<br>

<b>Cenário</b>: Ver as características da accenture<br>
Dado que o usuario esta no site da accenture<br>
Quando clicar no item sobre a accenture<br>
Quando clicar no item de menu sobre a accenture<br>
Então deve ver o destaque nosso proposito<br>

----------------------------------------------------------------------
link para a apresentação: https://www.canva.com/design/DAEhHsZj8NE/giFvaCj9FJqLcT4ucElcOA/view?utm_content=DAEhHsZj8NE&utm_campaign=designshare&utm_medium=link&utm_source=publishpresent#1<br>
----------------------------------------------------------------------

## Ferramentas utilizadas 
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação utilizada para programar os passos<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável para usar a linguagem Gherkin<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código Java com a linguagem Gherkin e automatização do navegadore<br>

:heavy_check_mark: <b>JUnit</b><br>
Framework responsável por fazer a manutenção e validação dos casos de testes<br>

--------------------------------------------------------------------
## Como utilizar
### Pré-requisitos
Instalar programas abaixo de acordo com seu sistema operacional.<br>
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk

- Instalar a IDE Eclipse

- Verificar se o JAVA_HOME está configurado em seu computador<br>

### Baixar a tarefa do GitHub
- Estando no repositório do projeto, clicar no botão "Code" (botão verde) e selecionar "Download ZIP"

- O arquivo virá compactado, descompactar o arquivo<br>

### Para importar no Eclipse
- Com o Eclipse aberto, ir na opção de menu File e em seguida selecionar "Open Projects from File System..."

- Na nova janela que se abriu, clicar no botão "Directory..." e escolher onde está a pasta do projeto que foi descompactado

- Selecionar a "testFinalTricentis", que deverá estar dentro de outra pasta e clicar no botão "Selecionar pasta"

- O Eclipse irá importar o projeto<br>

### Para executar a tarefa no Eclipse
- Após importar o projeto, dar dois cliques em "src/test/java"

- Dois cliquem em "runner"

- Dois cliques em "RunnerCasoDeTesteUm.java, por exemplo se quiser executar o Caso 1"

- Abrindo o código na janela central do Eclipse, clicar em qualquer lugar desses códigos com o botão direito e selecionar "Run As" -> "1 Cucumber Feature"

- Caso seja aberto uma janela dizendo que há um erro no Workspace do Eclipse, clique no botão "Proceed" que o código será executado corretamente. Isso é um bug de importação do próprio Eclipse.

- O código executará com sucesso.

- Executar esses mesmos passos novamente para executar os Casos de teste, somente mudando o arquivo "RunnerCasoDeTesteXXX.java".

-------------------------------------------------------------------

# Obrigado pela Oportunidade!