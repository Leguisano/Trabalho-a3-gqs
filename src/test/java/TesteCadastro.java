import base.CadastroTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.CadastroPage;

public class TesteCadastro extends CadastroTest {

    @Test
    public void testeCadastro(){
        CadastroPage page= new CadastroPage(getDriver());
        page.cadastroCredor("Henrique")
                .cadastroCelular(123456789)
                .cadastroTelefone(987654321)
                .cadastroEmail("teste@email.com")
                .cadastroBase("Base teste")
                .cadastroCEP(91750740)
                .cadastroBanco("Caixa")
                .cadastroAgencia(9999)
                .cadastroCC(88888)
                .cadastroDigito(123456);
                //.clicarCadastrar();

        String testeFinal = page.buscarResultadoCadastro();

        Assert.assertTrue(testeFinal.contains("Henrique"));
        Assert.assertTrue(testeFinal.contains("123456789"));
        Assert.assertTrue(testeFinal.contains("987654321"));
        Assert.assertTrue(testeFinal.contains("teste@email.com"));
        Assert.assertTrue(testeFinal.contains("Base teste"));
        Assert.assertTrue(testeFinal.contains("91750740"));
        Assert.assertTrue(testeFinal.contains("Caixa"));
        Assert.assertTrue(testeFinal.contains("9999"));
        Assert.assertTrue(testeFinal.contains("88888"));
        Assert.assertTrue(testeFinal.contains("123456"));


    }



}
