package com.PIGame.Aventure.level.tile;

import com.PIGame.Aventure.graficos.Screen;
import com.PIGame.Aventure.graficos.Sprite;

public class TileVazio extends Tile {

	public TileVazio(Sprite sprite) {
		super(sprite);
		
	}
	
	public void render(int x, int y, Screen screen){
		//Rederiza aqui!
		screen.RenderTile(x << 4, y << 4, this);
		
	}
	

}
