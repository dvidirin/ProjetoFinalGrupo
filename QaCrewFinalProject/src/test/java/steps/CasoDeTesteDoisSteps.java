package steps;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import setup.Configuracao;

public class CasoDeTesteDoisSteps {
	
	WebElement conteudoDesejado;
	
	String tituloDesejado;
	String msgValidation;
	String textoDesejado;
	
	@Quando("clica no item servicos")
	public void clica_no_item_servicos() {
		Configuracao.driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[2]/div[1]")).click();
	}

	@Então("deve mostrar os {string}")
	public void deve_mostrar_os(String nomeEsperado) throws InterruptedException {
		Thread.sleep(1000);
		conteudoDesejado = Configuracao.driver.findElement(By.linkText(nomeEsperado));
		textoDesejado = conteudoDesejado.getText();
		assertEquals(nomeEsperado, textoDesejado);
		
		Configuracao.close();
	}
	
	@Quando("clica no item do menu cloud")
	public void clica_no_item_do_menu_cloud() {
		Configuracao.driver.findElement(By.linkText("Cloud")).click();
	}

	@Então("deve encontrar o titulo servicos de cloud")
	public void deve_encontrar_o_titulo_servicos_de_cloud() throws InterruptedException {
		Thread.sleep(2000);
		tituloDesejado = Configuracao.driver.findElement(By.tagName("h1")).getText();
		assertEquals("Serviços de Cloud", tituloDesejado);
		
		Configuracao.close();
	}
}
