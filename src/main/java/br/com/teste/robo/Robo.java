package br.com.teste.robo;

import java.io.IOException;
import java.util.Arrays;

public class Robo {
	int limiteX, limiteY, posicaoX, posicaoY;
	private final String DIREITA = "DIREITA";
	private final String ESQUERDA = "ESQUERDA";
	private final String CIMA = "CIMA";
	private final String BAIXO = "BAIXO";

	
	public Robo(int limiteX, int limiteY, int posicaoX, int posicaoY) {
		if(posicaoX < 0 || posicaoX > limiteX || posicaoY < 0 || posicaoY > limiteY)
			throw new RuntimeException("Objeto possui valores de posições inicias inválidos.");

			
		this.limiteX = limiteX;
		this.limiteY = limiteY;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}

	public int getLimiteX() {
		return limiteX;
	}

	public void setLimiteX(int limiteX) {
		this.limiteX = limiteX;
	}

	public int getLimiteY() {
		return limiteY;
	}

	public void setLimiteY(int limiteY) {
		this.limiteY = limiteY;
	}

	public void Posicao(int x, int y) {
		this.posicaoX = x;
		this.posicaoY = y;
	}

	public void moverDireita(int passos){
		if (!verificarMoverDireita(passos)) 
			throw new RuntimeException("Você não poe mover para direita.");
	
		this.posicaoX += passos;		
	    try {
	    	Log.gerarLog(passos, DIREITA);
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public void moverEsquerda(int passos) {
		if (!verificarMoverEsquerda(passos)) 
			throw new RuntimeException("Você não poe mover para esquerda.");
	
		this.posicaoX -= passos;	
		try {
	    	Log.gerarLog(passos, ESQUERDA);
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void moverCima(int passos) {
		if (!verificarMoverCima(passos)) 
			throw new RuntimeException("Você não poe mover para cima.");
	
		this.posicaoY += passos;	
		try {
	    	Log.gerarLog(passos, CIMA);
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void moverBaixo(int passos) {
		if (!verificarMoverBaixo(passos)) 
			throw new RuntimeException("Você não poe mover para baixo.");
	
		this.posicaoY -= passos;	
		try {
	    	Log.gerarLog(passos, BAIXO);
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public Boolean verificarMoverDireita(int passos) {
		if (this.posicaoX+passos <= this.limiteX) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean verificarMoverEsquerda(int passos) {
		if (this.posicaoX-passos >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean verificarMoverCima(int passos) {
		if (this.posicaoY+passos <= this.limiteY) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean verificarMoverBaixo(int passos) {
		if (this.posicaoY-passos >= 0) {
			return true;
		} else {
			return false;
		}
	}
}
