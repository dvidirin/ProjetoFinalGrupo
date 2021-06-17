package steps;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.By;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import setup.Configuracao;

public class CasoDeTesteQuatroSteps {

	String msgValidacao;
	
	@Quando("clicar no item sobre a accenture")
	public void clicar_no_item_sobre_a_accenture() {
		Configuracao.driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[5]/div[1]/span")).click();
	}

	@Quando("clicar no item de menu sobre a accenture")
	public void clicar_no_item_de_menu_sobre_a_accenture() throws InterruptedException {
		Thread.sleep(2000);
		Configuracao.driver.findElement(By.linkText("Sobre a Accenture")).click();
	}

	@Então("deve ver o destaque nosso proposito")
	public void deve_ver_o_destaque_nosso_proposito() throws InterruptedException {
		Thread.sleep(2000);
		msgValidacao = Configuracao.driver.findElement(By.className("sectionTitle")).getText();
		assertEquals("Nosso propósito:", msgValidacao);
		
		Configuracao.close();
	}
}
