package net.ld31.game.level.tile;

import net.ld31.game.graphics.Screen;
import net.ld31.game.graphics.Sprite;

public class Tile {

	public int x, y;
	public Sprite sprite;

	public static Tile green = new WalkableTile(Sprite.green);
	public static Tile red = new WalkableTile(Sprite.red);
	public static Tile blue = new WalkableTile(Sprite.blue);
	public static Tile yellow = new WalkableTile(Sprite.yellow);
	public static Tile voidTile = new WalkableTile(Sprite.yellow);

	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}

	public void render(int x, int y, Screen screen) {

	}

	public boolean solid() {
		return false;
	}

}