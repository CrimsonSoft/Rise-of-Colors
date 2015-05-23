package com.PIGame.Aventure.entidades;

import java.awt.geom.Rectangle2D;
import java.util.Random;

import com.PIGame.Aventure.graficos.Screen;
import com.PIGame.Aventure.level.Level;

public abstract class Entidades {

	public int posicaoX, posicaoY;
	private Rectangle2D corpo;
	public boolean remover = false;
	protected Level level;
	protected final Random random = new Random();

	public void updated() {

	}

	public void render(Screen tela) {

	}

	public void removendo() {
		// remove do level,map,fase... etc;
		remover = true;
	}

	public boolean removido() {
		return remover;
	}

	public void render() {

	}

	public Rectangle2D getCorpo() {
		return corpo;
	}

	public void setCorpo(Rectangle2D corpo) {
		this.corpo = corpo;
	}

}
