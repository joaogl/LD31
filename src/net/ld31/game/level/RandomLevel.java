package net.ld31.game.level;

public class RandomLevel extends Level {

	public RandomLevel(int width, int height) {
		super(width, height);
	}

	protected void generateLevel() {
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
				tiles[x + y * width] = random.nextInt(4);
	}

}