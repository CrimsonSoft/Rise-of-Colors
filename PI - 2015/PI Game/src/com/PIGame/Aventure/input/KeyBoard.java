package com.PIGame.Aventure.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard implements KeyListener{


	private boolean[] botao = new boolean[120];
	public boolean cima, baixo, esquerda, direita, accept,back;
	
	public void update(){
		cima = botao[KeyEvent.VK_UP] || botao[KeyEvent.VK_W];
		baixo = botao[KeyEvent.VK_DOWN] || botao[KeyEvent.VK_S];
		esquerda = botao[KeyEvent.VK_LEFT] || botao[KeyEvent.VK_A];
		direita = botao[KeyEvent.VK_RIGHT] || botao[KeyEvent.VK_D];
		accept = botao[KeyEvent.VK_ENTER] ;	
		back = botao[KeyEvent.VK_BACK_SPACE];
		//apenas para testar se estava funcionando na hora que preciona-se.
		/*
		for(int i = 0 ; i < botao.length; i++){
			if(botao[i]){
				System.out.println("botao: " + i);
			}
		}
		*/
	}
	
	
	public void keyPressed(KeyEvent e) {
		botao[e.getKeyCode()] = true;
		
	}


	public void keyReleased(KeyEvent e) {
		botao[e.getKeyCode()] = false;
		
	}


	public void keyTyped(KeyEvent e) {
		
		
	}

}
