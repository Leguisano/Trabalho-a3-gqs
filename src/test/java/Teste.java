import base.BaseTest;
import lombok.extern.java.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.CadastroProdutoPage;


@Log
public class Teste extends BaseTest {

    @Test
    public void teste(){
        log.info("Iniciando Teste");
        CadastroProdutoPage page = new CadastroProdutoPage(getDriver());
        page.informarNomeProduto("detergente")
                .selecionarCategoria("Higiene")
                .selecionarCanalVenda("E-Commerce", "Loja Física", "Telefone")
                .informarEstoqueMinimo("5")
                .informarEstoqueMaximo("25")
                .clicarCadastrar();

      //  Assert.assertEquals(page.buscarLabelResultado(), "Cadastrado!");

        String resultadoFinal =  page.buscarResultadoCadastro();

     //   Assert.assertTrue(resultadoFinal.contains("Nome: detergente"));
       Assert.assertTrue(resultadoFinal.contains("Categoria:higiene"));
       // Assert.assertTrue(resultadoFinal.contains("Canais de Venda: E-Commerce Loja Física Telefone"));
      //  Assert.assertTrue(resultadoFinal.contains("Estoque Minimo: 5"));
     //   Assert.assertTrue(resultadoFinal.contains("Estoque Máximo: 25"));
     //   Assert.assertTrue(resultadoFinal.contains("Disponibilizar para venda imediata?: sim"));
     //   Assert.assertTrue(resultadoFinal.contains("Formas de Venda: Unidade Caixa"));


    }






}
