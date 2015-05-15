package com.PIGame.Aventure.entidades;

import java.util.Random;

import com.PIGame.Aventure.graficos.Screen;
import com.PIGame.Aventure.level.Level;
import com.PIGame.core.Quadrado;

public abstract class Entidades {

	public int posicaoX, posicaoY;
	public Quadrado corpo;
	public boolean remover = false;
	protected Level level;
	protected final Random random = new Random();
	
	public void updated(){
		
	}
	public void render(Screen tela){
		
	}
	public void removendo(){
		//remove do level,map,fase... etc;
		remover = true;
	}
	
	public boolean removido(){
		return remover;
	}
	public void render(){
		
	}
	
}
