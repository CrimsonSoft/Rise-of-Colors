package com.PIGame.Aventure.entidades.mob;

import java.awt.geom.Rectangle2D;

import com.PIGame.Aventure.graficos.Screen;
import com.PIGame.Aventure.graficos.Sprite;
import com.PIGame.Aventure.input.KeyBoard;


public class Jogador extends Mob {

	private KeyBoard input;
	private Sprite sprite;
	private int animacao = 0;
	private boolean andando = false;
	private Rectangle2D aux;
	

	public Jogador(KeyBoard input) {
		this.input = input;
		sprite = Sprite.player_deCosta;

	}

	public Jogador(int localX, int localY, KeyBoard input) {
		this.posicaoX = localX;
		this.posicaoY = localY;
		this.input = input;
		
		aux = null;
		try{
		aux.setRect((localX - 16), (localY - 16), (localX + 16), (localY + 16));
		corpo.setDele(aux);
		}
		catch(Exception e)
		{
			System.out.println(e + "   :Sem informação sobre o  jogador");
		}

	}

	public void updated() {
		int moverX = 0, moverY = 0;
		// As duas varias acima irao marca se o player moveu, passando os
		// parametros 1 e -1 para o metodo mover na classe Mob

		if (animacao < 7500)
			animacao++;
		else
			animacao = 0;
		if (input.cima)
			moverY--;
		if (input.baixo)
			moverY++;
		if (input.direita)
			moverX++;
		if (input.esquerda)
			moverX--;

		if (moverX != 0 || moverY != 0) {
			mover(moverX, moverY);
			andando = true;
		} else {
			andando = false;
		}
	}

	public void render(Screen tela) {
		int flip = 0;
		if (direcao == 0) {
			sprite = Sprite.player_deCosta;
			if (andando) {
				if (animacao % 20 > 10) {
					sprite = Sprite.player_deCosta1;
				} else {
					sprite = Sprite.player_deCosta2;
				}
			}
		}

		if (direcao == 2) {
			sprite = Sprite.player_deFrente;
			if (andando) {
				if (animacao % 20 > 10) {
					sprite = Sprite.player_deFrente1;
				} else {
					sprite = Sprite.player_deFrente2;
				}
			}
		}

		if (direcao == 1) {
			sprite = Sprite.player_DireitaEsquerda;
			if (andando) {
				if (animacao % 20 > 10) {
					sprite = Sprite.player_DireitaEsquerda1;
				} else {
					sprite = Sprite.player_DireitaEsquerda2;
				}
			}
		}
		if (direcao == 3) {
			sprite = Sprite.player_DireitaEsquerda;
			if (andando) {
				if (animacao % 20 > 10) {
					sprite = Sprite.player_DireitaEsquerda1;
				} else {
					sprite = Sprite.player_DireitaEsquerda2;
				}
			}
			flip = 1;
		}
		tela.renderJogador(posicaoX - 16, posicaoY - 16, sprite, flip);

	}

}
