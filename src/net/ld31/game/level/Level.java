package net.ld31.game.level;

import net.ld31.game.graphics.Screen;

public class Level {

	protected int width, height;
	protected int[] tiles;

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

	}

}