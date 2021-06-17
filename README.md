<h1>🚀 [   ACCADEMIA ACCENTURE QA   ] </h1>

### Time QA: Jennefer Pequeno, Julia Paulino, Jéssica Bianca, Jéssica Lira, Jeanne Barbosa, Kamila Feitosa</h2>

###  💻 Tecnologias utilizadas: Cucumber, Selenium Web Driver, Junit, Java & Trello

## Trello: https://trello.com/b/F68pTAcE/no-bugs-projeto-qa-accenture

<br>

# O desafio
## Validar cenários dentro do site da accenture.com/br-pt

<br>

# Casos de teste

**Cenário 1:** Aceitar o cookie LGPD<br>
 
**Cenário 2:** Configurações do cookie<br>

**Cenário 3:** Listar serviços da Accenture<br>

**Cenário 4:** Clicar no serviço cloud<br>

**Cenário 5:** Acessar o item de vagas de tecnologia<br>

**Cenário 6:** Procurando uma vaga <br>

**Cenário 7:** Ver as características da accenture<br>

<br>

# Pré requisitos

1. Instalar JDK 11.0.1<br>
https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html

2. Verificar em variáveis de ambiente se  JAVA_HOME está configurado com o caminho indicando para<br> 
<b>\Program Files\Java\jdk-11.0.11</b>

3. Adicionar em path em variáveis de ambiente em 'Variáveis do sistema' o caminho indicando para<br>
<b>\Program Files\Java\jdk-11.0.11\bin </b>

4. Instalação do Eclipse<br>
https://www.eclipse.org/downloads/<br>

5. Baixar e descompactar o ChromeDriver:<br>
<b>Abra o chrome e verifique a versão do chrome em 'Sobre o Google Chrome' e posteriormente instale o chrome driver de acordo com a versão do seu chrome

https://chromedriver.chromium.org/downloads<br>

Descompacte o arquivo e copie o caminho para efetuar a seguinte modificação:
 
 <b>IMPORTANTÍSSIMO:</b> Ao abrir o projeto aponte para o chromedriver que está na sua máquina: <br> 
System.setProperty("webdriver.chrome.driver", "caminhoNaSuaMáquina\chromedriver.exe");
<br>

# Passo a passo para abrir o projeto no Eclipse
 
1. No seu terminal digite: git clone https://github.com/jkpequeno/ProjetoNoBugs.git <br>
Observação: se for da sua preferência trocar a pasta que o projeto vai ficar a navegação é simples: <br>
ls (lista as pastas) > cd nomeDaPasta que você deseja que o projeto fique e por fim:<br> git clone https://github.com/jkpequeno/ProjetoNoBugs.git

2. Abra o eclipe e clique em 'Browse' > busque pela pasta ProjetoNoBugs > selecione a pasta > Clique em Launch para abrir

3. Acesse Window > Preferences > General > Workspace > Modifique o 'Text File encoding' para 'Other' e selecione 'UTF-8' > clique em 'Apply and Close'

4. Clique em 'File' > clique em 'Open Projects from Fyle System' >  clique em 'Directory' > Selecione a pasta clonada 'ProjetoNoBugs' > Clique em 'Finish'

5. Abra o cenário que deseja verificar, acesse: src/test/java > vá em 'steps' > abra steps e altere o caminho para a pasta do webdriver em sua máquina <br>

   System.setProperty("webdriver.chrome.driver", "C:\\caminhoDaSuaMáquinaAtéOExecutavel\\chromedriver.exe");

6. Help > Marketplace > Instalar Cucumber > Feche o Eclipse e abra novamente para dar Run na feature desejada.
