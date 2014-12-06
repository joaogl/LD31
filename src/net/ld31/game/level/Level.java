package net.ld31.game.level;

import java.util.Random;

import net.ld31.game.graphics.Screen;
import net.ld31.game.level.tile.Tile;

public class Level {

	protected int width, height;
	protected int[] tiles;

	protected Random random = new Random();

	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		tiles = new int[width * height];
		generateRandomLevel();
	}

	public Level(String path) {
		loadLevel(path);
	}

	private void generateRandomLevel() {
	}

	public void loadLevel(String path) {

	}

	public void time() {

	}

	public void update() {

	}

	public void render(int xScroll, int yScroll, Screen screen) {
		screen.setOffset(xScroll, xScroll);
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width + 16) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height + 16) >> 4;

		for (int y = y0; y < y1; y++)
			for (int x = x0; x < x1; x++)
				getTile(x, y).render(x, y, screen);
	}

	public Tile getTile(int x, int y) {
		if ((x + y * width) < 0 || (x + y * width) >= tiles.length) return Tile.voidTile;
		if (tiles[x + y * width] == 0) return Tile.green;
		else if (tiles[x + y * width] == 1) return Tile.green;
		else if (tiles[x + y * width] == 2) return Tile.green;
		else if (tiles[x + y * width] == 3) return Tile.green;
		return Tile.voidTile;
	}

}