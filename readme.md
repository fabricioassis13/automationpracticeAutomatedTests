# AutomationPracticeAutomatedTests

Este projeto foi criado com o objetivo de demonstrar meus conhecimentos sobre testes automatizados em aplicações Web. Contém apenas um caso de teste simulando uma compra com sucesso no site [MyStore](http://automationpractice.com/index.php)

## Tecnologias Utilizadas

- Java (Versão 1.8)
- JUnit5 (Versão 5.7.1)
- Maven (Gerenciador do IntelliJ IDE)
- Allure (Versão 2.10.0)
- Java Faker (Versão 1.0.2)
- WebDriverManager (Versão 4.4.1)
- IntelliJ IDE (Versão 2020.1.2)

## Padrões Utilizados
Observação: O padrão estrutural utilizado foi o PageObjects. Para o mapeamento dos elementos foi usada a técnica PageFactory.

### Main/Java

- **Framework:** Pasta onde se encontram as classes de configuração do projeto
- **Models:** Pasta onde se encontram classes de modelo de objeto para dados (POJO)
- **Utils:** Pasta onde se encontram classes com métodos auxiliares que serão utilizadas em todo o projeto

### Main/Resources

Pasta onde se encontram arquivos de dados para execução dos testes

### Test/Java

- **PageObjects:** Pasta onde se encontram classes de mapeamento dos WebElements.
- **Tasks:** Pasta onde se encontram classes de interação com os WebElements.
- **TestCases:** Pasta onde se encontram classes e métodos de testes.
- **Validations:** Pasta onde se encontram todas as validações feitas pelas Tasks.

## Como executar o projeto?

Primeiramente, você deverá clonar o projeto na sua máquina por meio do seguinte comando:

> git clone linkdorepositorioondeestaoprojeto

### Abrindo o projeto na IDE:

Este projeto foi feito no IntelliJ, porém, você pode usar a IDE de sua preferência para executa-lo.

Assim que abri-lo, clique com o botão direito do mouse em cima da classe TestCases/RealizaCompraComSucesso.java e execute-a.

### Reports:

Este projeto foi construido com o gerador de relatórios Allure.

Para visualizar os relatórios é necessário ter a ferramenta Allure intalada na sua máquina.

#### Instalação do Allure

Para instalar o Allure, primeiramente, iremos instalar um gerador de pacotes no PowerShell (Scoop) para que possamos baixar o Allure sem dificuldades. Para isso, vá ao PowerShell e execute os seguintes comandos:

Setar uma política de privacidade para poder installar o Scoop:
> Set-ExecutionPolicy RemoteSigned -Scope CurrentUser

Uma pergunta vai aparecer. Reesponda digitando 'y' ou 's' e pressione Enter.
Em seguida, execute o comando abaixo para realizar a instalação.
> iex (new-object net.webclient).downloadstring('https://get.scoop.sh')

Ao terminar, recomendo instalar os programas openssh e git , pois o Scoop os utiliza para atualizar a si mesmo.

Em seguida digite o comando abaixo para installar o Allure:
> scoop install allure

Para se sertificar que o Allure foi instalado com sucesso, digite o comando abaixo para visualizar a versão do Allure:
> allure -version

#### Visualizando relatórios

Abra o terminal de sua preferência (pode ser o da própria IDE) na raiz do projeto e digite o comando:
> allure serve target/allure-results

Desta primeira forma, o Allure sobe um servidor local e mostra os resultados dos testes.

Para exportar um arquivo .html do relatório, abra o terminal e digite os comandos:
> allure generate allure-results

> allure open