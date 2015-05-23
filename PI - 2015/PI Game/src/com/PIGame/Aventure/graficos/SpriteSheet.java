package com.PIGame.Aventure.graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

	private String caminho;
	public final int TAMANHO;
	public int[] pixels;

	public static SpriteSheet tiles = new SpriteSheet(
			"/Texturas/spritesheet.png", 256); // Carrega o caminho para o
												// arquivo de sprites.

	public static SpriteSheet tiles01 = new SpriteSheet("/Texturas/arvore.png",
			64);

	public SpriteSheet(String path, int tamanho) {

		this.caminho = path;
		this.TAMANHO = tamanho;
		pixels = new int[TAMANHO * TAMANHO];
		Carregar();

	}

	private void Carregar() {
		try {
			BufferedImage imagem = ImageIO.read(SpriteSheet.class
					.getResource(caminho));
			int largura = imagem.getWidth();
			int altura = imagem.getHeight();
			imagem.getRGB(0, 0, largura, altura, pixels, 0, largura);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
