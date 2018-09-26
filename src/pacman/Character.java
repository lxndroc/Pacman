package pacman;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public abstract class Character {

    protected int x, y;
    protected int dx, dy;
    protected double speed;
    protected Direction direction;
    protected boolean visible;
    protected BufferedImage frame;
    protected BufferedImage[] frames;

    public Character() {
        visible = true;
    }

    protected void loadFrames(Character character, String... framesRes) {
        try {
            frames = new BufferedImage[framesRes.length];
            for (int i = 0; i < framesRes.length; i++) {
                String frameRes = framesRes[i];
                frames[i] = ImageIO.read(getClass().getResourceAsStream(frameRes));
            }
            frame = frames[0];
        } catch (IOException ex) {
            System.out.println(ex);
            System.exit(-1);
        }
    }

    public boolean isVisible() {
        return visible;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public BufferedImage getFrame() {
        return frame;
    }

    public BufferedImage[] getFrames() {
        return frames;
    }

    /*public Tile getTile() {
        return null;
    }*/
   
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setFrame(BufferedImage frame) {
        this.frame = frame;
    }

    public void setFrames(BufferedImage[] frames) {
        this.frames = frames;
    }

    public boolean isFacingBlock() {
        return false;
    }

    public void move() {
    }
}
