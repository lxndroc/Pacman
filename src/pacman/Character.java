package pacman;

import java.awt.image.BufferedImage;

public class Character {

    private int x, y;
    private int dx, dy;
    private double speed;
    private Direction direction;
    public boolean visible;
    public BufferedImage frame;
    public BufferedImage[] frames;

    public Character() {
        super();
    }

    public Tile getTile() {
        // TODO implement me
        return null;
    }

    public boolean isFacingBlock() {
        // TODO implement me
        return false;
    }

    public void move() {
        // TODO implement me
    }
}