package testesAvaliador;

import org.junit.Assert;
import org.junit.Test;

import projetoTeste.Avaliador;
import projetoTeste.Lance;
import projetoTeste.Leilao;
import projetoTeste.Usuario;

public class TesteDoAvaliador {
		
	@Test
	public void testaMaiorLance() {
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		Leilao leilao = new Leilao("Playstation 3 Novo");
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.0));
		leilao.propoe(new Lance(maria, 250.0));
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);				
		Assert.assertEquals(leiloeiro.getMaiorLance(),400,0.001);
	}
	
	@Test
	public void testaMenorLance() {
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		Leilao leilao = new Leilao("Playstation 3 Novo");
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.0));
		leilao.propoe(new Lance(maria, 250.0));
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		Assert.assertEquals(leiloeiro.getMenorLance(),260,0.001);
	}
}