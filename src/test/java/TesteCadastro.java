import base.CadastroTest;
import org.awaitility.Awaitility;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.CadastroPage;

public class TesteCadastro extends CadastroTest {

    @Test
    public void testeCadastro(){
        CadastroPage page = new CadastroPage(getDriver());
        page.cadastroCredor("Henrique")
                .cadastroCelular(123456789)
                .cadastroTelefone(987654321)
                .cadastroEmail("teste@email.com")
                .cadastroBase("Base teste")
                .cadastroCEP(91750740)
                .cadastroBanco("Caixa")
                .cadastroAgencia(9999)
                .cadastroCC(88888)
                .cadastroDigito(123456)
                .clicarCadastrar(); // Descomentei essa linha para submeter o formulário

        // Aguarde a submissão e o carregamento da resposta
        Awaitility.await().until(() -> page.buscarResultadoCadastro().contains("Cadastro realizado com sucesso"));

        String testeFinal = page.buscarResultadoCadastro();

        // Verifique a mensagem de sucesso
        Assert.assertTrue(testeFinal.contains("Cadastro realizado com sucesso"), "A mensagem de sucesso não foi encontrada.");

        // Verifique os dados preenchidos
//        Assert.assertTrue(testeFinal.contains("Henrique"));
//        Assert.assertTrue(testeFinal.contains("123456789"));
//        Assert.assertTrue(testeFinal.contains("987654321"));
//        Assert.assertTrue(testeFinal.contains("teste@email.com"));
//        Assert.assertTrue(testeFinal.contains("Base teste"));
//        Assert.assertTrue(testeFinal.contains("91750740"));
//        Assert.assertTrue(testeFinal.contains("Caixa"));
//        Assert.assertTrue(testeFinal.contains("9999"));
//        Assert.assertTrue(testeFinal.contains("88888"));
//        Assert.assertTrue(testeFinal.contains("123456"));

    }
}
