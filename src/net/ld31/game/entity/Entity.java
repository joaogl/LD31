package net.ld31.game.entity;

import java.util.Random;

import net.ld31.game.graphics.Screen;
import net.ld31.game.level.Level;

public abstract class Entity {

	public int x, y;
	public boolean removed = false;
	protected Level level;
	protected final Random random = new Random();

	public void update() {

	}

	public void render(Screen screen) {

	}

	public void remove() {
		removed = true;
	}

	public boolean isRemoved() {
		return removed;
	}

}