package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import setup.Configuracao;


public class CasoDeTesteUmSteps {
	
	String msgValidacao;
	String msgValidacaoItem;
	
	@Dado("que o usuario esta no site da accenture")
	public void que_o_usuario_esta_no_site_da_accenture() {
		StepExtra.siteAcc();
	}

	@Quando("abre as configuracoes de cookies")
	public void abre_as_configuracoes_de_cookies() {
	    Configuracao.driver.findElement(By.id("onetrust-pc-btn-handler")).click();
	}

	@Quando("clica em confirmar minhas escolhas")
	public void clica_em_confirmar_minhas_escolhas() {
		Configuracao.driver.findElement(By.xpath("//*[@id=\"onetrust-pc-sdk\"]/div[3]/div[1]/button[1]")).click();
	}

	@Então("deve fechar a caixa de informacao")
	public void deve_fechar_a_caixa_de_informacao() {
		msgValidacao = Configuracao.driver.findElement(By.id("optanon-minimize-button")).getText();
		assertEquals("Configuração dos cookies", msgValidacao);
		
		Configuracao.close();
	}
	
	@Então("deve ver o item Sua privacidade")
	public void deve_ver_o_item_sua_privacidade() {
		Configuracao.driver.findElement(By.id("privacy-text")).click();
	    msgValidacaoItem = Configuracao.driver.findElement(By.id("pc-privacy-header")).getText();
	    assertEquals("Sua privacidade", msgValidacaoItem);
	}

	@Então("deve ver o item Cookies estritamente necessarias")
	public void deve_ver_o_item_cookies_estritamente_necessarias() {
		Configuracao.driver.findElement(By.id("ot-header-id-1")).click();
	    msgValidacaoItem = Configuracao.driver.findElement(By.id("ot-header-id-1")).getText();
	    assertEquals("Cookies estritamente necessárias", msgValidacaoItem);
	}

	@Então("deve ver o item Cookies Analiticos de Primeira Parte")
	public void deve_ver_o_item_cookies_analiticos_de_primeira_parte() {
		Configuracao.driver.findElement(By.id("ot-header-id-2")).click();
	    msgValidacaoItem = Configuracao.driver.findElement(By.id("ot-header-id-2")).getText();
	    assertEquals("Cookies Analíticos de Primeira Parte", msgValidacaoItem);
	}

	@Então("deve ver o item Cookies de Desempenho e Cookies Funcionais")
	public void deve_ver_o_item_cookies_de_desempenho_e_cookies_funcionais() {
		Configuracao.driver.findElement(By.id("ot-header-id-3")).click();
	    msgValidacaoItem = Configuracao.driver.findElement(By.id("ot-header-id-3")).getText();
	    assertEquals("Cookies de Desempenho e Cookies Funcionais", msgValidacaoItem);
	}

	@Então("deve ver o item Cookies de Publicidade e Redes Sociais")
	public void deve_ver_o_item_cookies_de_publicidade_e_redes_sociais() {
		Configuracao.driver.findElement(By.id("ot-header-id-4")).click();
	    msgValidacaoItem = Configuracao.driver.findElement(By.id("ot-header-id-4")).getText();
	    assertEquals("Cookies de Publicidade e Redes Sociais", msgValidacaoItem);
	    
	    Configuracao.close();
	}
}
