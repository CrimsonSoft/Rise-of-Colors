package com.PIGame;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import com.PIGame.Aventure.entidades.mob.*;

public class Colisao  {

	protected boolean colidiu = false;

	public Colisao() {

	};

	// reference
	// http://pontov.com.br/site/xna/53-xna/287-colisao-por-retangulos-jogos-bidimensionais-em-xna
	public boolean CalcColisao(Jogador player, ArrayList<Mob> Inimigos) {

		Rectangle2D testecolidiu = player.getCorpo().getBounds2D();

		for (int j = 0; j < Inimigos.size(); j++) {
			Mob a = (Mob) Inimigos.get(j);
			Rectangle2D comparar = a.getCorpo().getBounds2D();

			if (testecolidiu.intersects(comparar)) {
				colidiu = true;
			} else
				colidiu = false;
		}
		return colidiu;
	}
}
