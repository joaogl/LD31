package net.ld31.game.level.tile;

import net.ld31.game.graphics.Screen;
import net.ld31.game.graphics.Sprite;

public class WalkableTile extends Tile {

	public WalkableTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, sprite);
	}

}