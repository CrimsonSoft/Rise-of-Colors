package com.PIGame.Aventure.entidades.mob;

import com.PIGame.Aventure.entidades.Entidades;
import com.PIGame.Aventure.graficos.Sprite;

public abstract class Mob extends Entidades {
	
	protected Sprite spritemob;
	protected int direcao = 0;
	protected boolean movendo = false;
	
	public void mover(int moverX, int moverY){
		//Exemplo: A ideia é fazer mover-se atraves de adicao e subtracao, se for x = -1 vai subtrair fazendo se mover para a Esquerda
		//Se x = 1 irá adicionar e fazer o personagem mover-se para direita, se x = 0 ele estará parado;
		
		if(moverX > 0) direcao = 1; //right
		if(moverX < 0) direcao = 3; //left
		if(moverY > 0) direcao = 2; //down
		if(moverY < 0) direcao = 0; //up
		
		if(!colisao()){
			posicaoX += moverX;
			posicaoY += moverY;
		}
	}
	public void updated(){
		
	}
	private boolean colisao(){
		return false;
	}
	public void render(){
		
	}

}
