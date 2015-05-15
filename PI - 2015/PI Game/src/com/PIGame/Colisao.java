package com.PIGame;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import com.PIGame.Aventure.entidades.mob.*;


public class Colisao implements core {
	
	protected boolean colidiu = false;
	

	public Colisao() {

	};
	

	public boolean CalcColisao(Jogador player, ArrayList<Mob> Inimigos) {
		
		  Rectangle2D testecolidiu = player.corpo.dele.getBounds2D();

	        for (int j = 0; j < Inimigos.size(); j++) {
	            Mob a = (Mob) Inimigos.get(j);
	            Rectangle2D comparar = a.corpo.dele.getBounds2D();

	            if (testecolidiu.intersects(comparar)) {
	               colidiu =true;
	            }
	            else colidiu = false;
	        }
				return colidiu;
	}
}
