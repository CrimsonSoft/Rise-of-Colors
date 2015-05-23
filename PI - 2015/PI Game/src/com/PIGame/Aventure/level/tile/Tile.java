package com.PIGame.Aventure.level.tile;

import com.PIGame.Aventure.graficos.Screen;
import com.PIGame.Aventure.graficos.Sprite;

public class Tile {

	public int coordenadaX, coordenadaY;
	public Sprite sprite;

	public static Tile floorSprite01 = new TileFloorSprite01(
			Sprite.floorSprite01);
	public static Tile floorSprite02 = new TileFloorSprite02(
			Sprite.floorSprite02);
	public static Tile floorSprite03 = new TileFloorSprite03(
			Sprite.floorSprite03);
	
	public static Tile arvore = new Arvore(
			Sprite.arvore);
	
	public static Tile vazio = new TileVazio(Sprite.vazio);

	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}

	public void render(int x, int y, Screen screen) {

	}

	public boolean solid() {
		return false;
	}
}
