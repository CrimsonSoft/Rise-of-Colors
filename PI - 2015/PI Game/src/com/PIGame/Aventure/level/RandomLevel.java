package com.PIGame.Aventure.level;

import java.util.Random;

public class RandomLevel extends Level{

	
	private static final Random random = new Random();
	
	public RandomLevel(int largura, int altura) {
		super(largura, altura);
		
	}
	
	protected void criarLevelRandomico(){
		for(int i = 0; i < altura;i++){
			for(int j = 0; j < largura;j++){
				tiles[j+i*largura] = random.nextInt(4);
			}   
		}
		
	}

}
