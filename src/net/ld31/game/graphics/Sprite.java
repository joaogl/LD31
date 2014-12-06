package net.ld31.game.graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;

	public static Sprite green = new Sprite(16, 0, 0, SpriteSheet.main);
	public static Sprite red = new Sprite(16, 1, 0, SpriteSheet.main);
	public static Sprite yellow = new Sprite(16, 0, 1, SpriteSheet.main);
	public static Sprite blue = new Sprite(16, 1, 1, SpriteSheet.main);
	public static Sprite voidSprite = new Sprite(16, 0xffffff);

	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		load();
	}

	public Sprite(int size, int color) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		setColor(color);
	}

	private void setColor(int c) {
		for (int i = 0; i < SIZE * SIZE; i++) {
			pixels[i] = c;
		}
	}

	private void load() {
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
			}
		}
	}
}