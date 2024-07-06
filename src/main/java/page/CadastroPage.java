package page;

import base.BasePage;
import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CadastroPage extends BasePage {

    @FindBy(id="creditorName")
    private WebElement nomeCredor;
    @FindBy(id="creditorCelular")
    private WebElement celular;
    @FindBy(id="creditorTelefone")
    private WebElement telefone;
    @FindBy(id="creditorEmail")
    private WebElement email;
    @FindBy(id="creditorBase")
    private WebElement base;
    @FindBy(id="cep")
    private WebElement cep;
    @FindBy(id="creditorBanco")
    private WebElement banco;
    @FindBy(id="creditorAgencia")
    private WebElement agencia;
    @FindBy(id="creditorCC")
    private WebElement cc;
    @FindBy(id="creditorDigito")
    private WebElement digito;
    @FindBy(id="botao")
    private WebElement botao;

    public CadastroPage(WebDriver driver) {
        super(driver);
    }


    public CadastroPage cadastroCredor(String nome){
        nomeCredor.sendKeys(nome);
        return this;
    }

    public CadastroPage cadastroCelular(Integer idCelular){
        this.celular.sendKeys(idCelular.toString());
        return this;
    }

    //public void acessarPagina() {
    //    driver.get("https://www.google.com.br/");
   // }

    public CadastroPage cadastroTelefone(Integer idTelefone){
        this.telefone.sendKeys(idTelefone.toString());
        return this;
    }

    public CadastroPage cadastroEmail(String idEmail){
        email.sendKeys(idEmail);
        return this;
    }

    public CadastroPage cadastroBase(String idBase){
        base.sendKeys(idBase);
        return this;
    }

    public CadastroPage cadastroCEP(Integer idCep){
        this.cep.sendKeys(idCep.toString());
        return this;
    }

    public CadastroPage cadastroBanco(String idBanco){
        banco.sendKeys(idBanco);
        return this;
    }

    public CadastroPage cadastroAgencia(Integer idAgencia){
        this.agencia.sendKeys(idAgencia.toString());
        return this;
    }

    public CadastroPage cadastroCC(Integer idCC){
        this.cc.sendKeys(idCC.toString());
        return this;
    }

    public CadastroPage cadastroDigito(Integer idDigito){
        this.digito.sendKeys(idDigito.toString());
        return this;
    }

    public String buscarResultadoCadastro() {
        return driver.getPageSource();
    }


    public CadastroPage clicarCadastrar(){
        botao.click();
        return this;
    }



}
