package com.PIGame.Aventure.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.PIGame.Aventure.level.tile.Tile;

public class CarregandoLevel extends Level{

	
	
	public CarregandoLevel(String path){
		super(path);
	}
	
	//floor01 = 0x707070
	//floor02 = 0xaaaaaa
	//floor03 = 0xd6d6d6
	protected void criarLevelRandomico() {
		
		
		
	}
	
	protected void CarregarLevel(String path) {
		try{
			BufferedImage carregarImagem = ImageIO.read(CarregandoLevel.class.getResource(path));
			int w = altura = carregarImagem.getWidth();
			int h = largura = carregarImagem.getHeight();
			tiles = new int[largura*altura];
			carregarImagem.getRGB(0, 0, w, h, tiles, 0, largura);
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("Erro! Não foi possível carregar o arquivo de mapa!");
		}
	}
	
	
	
	
}
