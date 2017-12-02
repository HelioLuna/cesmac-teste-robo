package br.com.teste.robo;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RoboTest {
	
	@BeforeClass
	public static void cleanLog(){
		Log.limparLog();
	}
	@Test(expected=RuntimeException.class)
	public void testarCriarObjetoComValorInicialMaiorQueTamanhoMatriz(){
		Robo robo = new Robo(10, 10, 12, 5);
	}
	
	@Test(expected=RuntimeException.class)
	public void testarUltrapassarLimiteDireita(){
		Robo robo = new Robo(10, 10, 8, 5);
		robo.moverDireita(3);
	}
	
	@Test
	public void testarMoverParaDireita(){
		Robo robo = new Robo(20, 20, 2, 5);
		robo.moverDireita(3);
		robo.moverDireita(3);
		robo.moverDireita(10);

		Assert.assertEquals(18, robo.posicaoX);
		
	}
	
	@Test(expected=RuntimeException.class)
	public void testarUltrapassarLimiteEsquerda(){
		Robo robo = new Robo(10, 10, 2, 5);
		robo.moverEsquerda(3);
	}
	
	@Test
	public void testarMoverParaEsquerda(){
		Robo robo = new Robo(10, 10, 5, 5);
		robo.moverEsquerda(1);
		Assert.assertEquals(4, robo.posicaoX);
		
	}
	
	@Test(expected=RuntimeException.class)
	public void testarUltrapassarLimiteCima(){
		Robo robo = new Robo(10, 10, 1, 9);
		robo.moverCima(2);
	}
	
	@Test
	public void testarMoverParaCima(){
		Robo robo = new Robo(10, 10, 5, 5);
		robo.moverCima(1);
		Assert.assertEquals(6, robo.posicaoY);
		
	}
	
	
	@Test(expected=RuntimeException.class)
	public void testarUltrapassarLimiteBaixo(){
		Robo robo = new Robo(10, 10, 5, 1);
		robo.moverBaixo(2);
	}
	
	@Test
	public void testarMoverParaBaixo(){
		Robo robo = new Robo(10, 10, 5, 5);
		robo.moverBaixo(1);
		Assert.assertEquals(4, robo.posicaoY);
		
	}
	

}
