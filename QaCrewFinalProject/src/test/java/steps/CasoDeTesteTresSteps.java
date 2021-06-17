package steps;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import setup.Configuracao;

public class CasoDeTesteTresSteps {
	
	WebElement caixaPesquisa;
	
	String tituloDesejado;
	String msgValidation;
		
	@Quando("clicar no menu carreiras")
	public void clicar_no_menu_carreiras() {
		Configuracao.driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]")).click();
	}

	@Quando("clicar no item do menu vagas em tecnologia")
	public void clicar_no_item_do_menu_vagas_em_tecnologia() throws InterruptedException {
		Thread.sleep(2000);
		Configuracao.driver.findElement(By.cssSelector("#primaryLink4_Carreiras > div > div > ul > li:nth-child(3) > ul > li:nth-child(6) > a")).click();
	}

	@Então("deve ver o destaque em Carreiras em Tecnologia")
	public void deve_ver_o_destaque_em_carreiras_em_tecnologia() {
		tituloDesejado = Configuracao.driver.findElement(By.tagName("h1")).getText();
		assertEquals("Carreiras em tecnologia", tituloDesejado);
		
		Configuracao.close();
	}
	
	@Quando("clicar no item do menu procure por vagas")
	public void clicar_no_item_do_menu_procure_por_vagas() throws InterruptedException {
		Thread.sleep(2000);
		Configuracao.driver.findElement(By.xpath("//*[@id=\"primaryLink4_Carreiras\"]/div/div/ul/li[1]/span[2]/a[1]")).click();
	}

	@Quando("pesquisa por desenvolvedor no campo de busca")
	public void pesquisa_por_desenvolvedor_no_campo_de_busca() {
		caixaPesquisa = Configuracao.driver.findElement(By.id("job-search-hero-bar"));
		caixaPesquisa.sendKeys(Keys.CONTROL + "a");
		caixaPesquisa.sendKeys(Keys.DELETE);
		caixaPesquisa.sendKeys("Desenvolvedor");
	}
	
	@Quando("clicar no botao search")
	public void clicar_no_botao_search() {
		caixaPesquisa.sendKeys(Keys.ENTER);
	}

	@Então("deve ver a vaga de desenvolvedor")
	public void deve_ver_a_vaga_de_desenvolvedor() throws InterruptedException {
		Thread.sleep(3000);
		msgValidation = Configuracao.driver.findElement(By.xpath("//*[@id=\"latest-jobs\"]/div[1]/div[1]/a/div/div/h3")).getText();
		assertEquals("Desenvolvedor FullStack", msgValidation);
		
		Configuracao.close();
	}

}
