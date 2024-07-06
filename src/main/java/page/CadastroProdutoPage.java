package page;

import base.BasePage;
import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CadastroProdutoPage extends BasePage {
    @FindBy(id = "txt01")
    private WebElement txNomeProduto;
    @FindBy(id = "categoria")
    private WebElement selCategoriaProduto;
    @FindBy(id = "venda")
    private WebElement selCanalVenda;
    @FindBy(id = "txt02")
    private WebElement txEstoqueMinimo;
    @FindBy(xpath = "/html/body/div/form/fieldset/div[5]/input")
    private WebElement txEstoqueMaximo;
    @FindBy(id = "sim")
    private WebElement rdSim;
    @FindBy(name = "nao")
    private WebElement rdNao;
    @FindBy(xpath = "/html/body/div/form/div[3]")
    private WebElement checkUnidade;
    @FindBy(xpath = "/html/body/div/form/div[4]")
    private WebElement checkCaixa;
    @FindBy(xpath = "/html/body/div/form/div[5]")
    private WebElement checkPacote;
    @FindBy(xpath = "/html/body/div/form/div[6]")
    private WebElement checkDuzia;
    @FindBy(id = "elementosForm:cadastrar")
    private WebElement btnCadastrar;
    @FindBy(linkText = "google")
    private WebElement linkGoogle;
    @FindBy(partialLinkText = "GZH")
    private WebElement linkZh;

    public CadastroProdutoPage informarNomeProduto(String nome){
        txNomeProduto.sendKeys(nome);
        return this;
    }
    public CadastroProdutoPage informarEstoqueMinimo(String estoqueMin){
        txEstoqueMinimo.sendKeys(estoqueMin);
        return this;
    }
    public CadastroProdutoPage informarEstoqueMaximo(String estoqueMax){
        txEstoqueMaximo.sendKeys(estoqueMax);
        return this;
    }

    public CadastroProdutoPage selecionarCategoria(String categoria) {
        Select dropdown = new Select(selCategoriaProduto);
        dropdown.selectByVisibleText(categoria);
        return this;
    }

    public CadastroProdutoPage selecionarCanalVenda (String canal1, String canal2, String canal3){
        Select dropdown = new Select(selCanalVenda);
        dropdown.selectByVisibleText(canal1);
        dropdown.selectByVisibleText(canal2);
        dropdown.selectByVisibleText(canal3);
        return this;
    }

    public void acessarPagina() {
        driver.get("https://www.google.com.br/");
    }




//    public String buscarLabelResultado() {
//        final WebElement[] labelResultado = {null}; // Declara a variável fora do bloco de espera
//
//        Awaitility.await().atMost(25, TimeUnit.SECONDS).until(() -> {
//            labelResultado[0] = driver.findElement(By.xpath("/html/body/div/div/span")); // Atribui o valor dentro da função lambda
//            return labelResultado[0].isDisplayed();
//        });
//
//        return labelResultado[0].getText(); // Retorna o valor da variável
//    }

    public String buscarResultadoCadastro() {
        return driver.getPageSource();
    }


    public CadastroProdutoPage clicarCadastrar(){
        btnCadastrar.click();
        return this;
    }

    public CadastroProdutoPage(WebDriver driver) {
        super(driver);
    }
}

