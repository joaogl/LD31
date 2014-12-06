package net.ld31.game.level.tile;

import net.ld31.game.graphics.Screen;
import net.ld31.game.graphics.Sprite;

public class CollidableTile extends Tile {

	public CollidableTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, sprite);
	}

	public boolean solid() {
		return true;
	}

}