package com.PIGame.Aventure.graficos;

import java.util.Random;

import com.PIGame.Aventure.entidades.mob.Jogador;
import com.PIGame.Aventure.level.tile.Tile;

public class Screen {

	
	public int largura, altura;
	public int[] pixels;
	public final int TamanhoDoMapa = 64;
	public final int TamanhoDoMapaMascara = TamanhoDoMapa - 1;
	public int atualizadorX, atualizadorY;
	
	public int[] tiles = new int[TamanhoDoMapa*TamanhoDoMapa]; //4096 tiles
	
	private Random random = new Random();

	public Screen(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
		pixels = new int[largura * altura]; // Tamanho do Arry 50.400 ou seja de 0 - 50.399;
		
		for(int i = 0; i < TamanhoDoMapa*TamanhoDoMapa;i++){
			tiles[i] = random.nextInt(0xffffff);
		}
	}
	
	//Objetivo de fazer o pixels ficarem animados.
	
	public void limpar(){
		for(int i = 0; i <pixels.length;i++){
			pixels[i] = 0;
		}
	}
	
	public void RenderTile(int posicaoX, int posicaoY,Tile tile){
		posicaoX -= atualizadorX;
		posicaoY -= atualizadorY;
		for(int y = 0;y<tile.sprite.TAMANHO;y++){
			int compensadorY = y+posicaoY;
			for(int x = 0;x<tile.sprite.TAMANHO;x++){
				int compensadorX = x+posicaoX;
				if(compensadorX < -tile.sprite.TAMANHO || compensadorX >= largura || compensadorY < 0 || compensadorY >= altura) break;
				if(compensadorX < 0) compensadorX = 0;
				pixels[compensadorX+compensadorY*largura] = tile.sprite.pixels[x+y*tile.sprite.TAMANHO];
			}
		}
	}
	
	public void renderJogador(int posicaoX, int posicaoY,Sprite jogadorSprite ,int flipDirecao){
		posicaoX -= atualizadorX;
		posicaoY -= atualizadorY;
		for(int y = 0;y<32;y++){
			int compensadorY = y+posicaoY;
			int spriteY = y;
			if (flipDirecao == 2 || flipDirecao == 3)spriteY = 31-spriteY;
			for(int x = 0;x<32;x++){
				int compensadorX = x+posicaoX;
				int spriteX = x;
				if (flipDirecao == 1 || flipDirecao == 3)spriteX = 31-spriteX;
				if(compensadorX < -32 || compensadorX >= largura || compensadorY < 0 || compensadorY >= altura) break;
				if(compensadorX < 0) compensadorX = 0;
				int col = jogadorSprite.pixels[spriteX+spriteY*32];
				if(col != 0xffff00ff) pixels[compensadorX+compensadorY*largura] = col;
			}
		}
	}
	
	public void atualizacao(int atualizadorX, int atualizadorY){
		this.atualizadorX = atualizadorX;
		this.atualizadorY = atualizadorY;
	}
		
}
