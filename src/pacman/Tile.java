package pacman;

public class Tile {

    public int WIDTH;
    public int HEIGHT;
    public int x;
    public int y;
    public boolean wall;
    public boolean pacman;
    public boolean ghost;
    public boolean pill;
    public boolean powerPill;

    public Tile(int x, int y, boolean wall) {
        super();
        this.x = x;
        this.y = y;
        this.wall = wall;
    }

    public boolean isWall() {
        return wall;
    }

    public void setWall(boolean wall) {
        this.wall = wall;
    }
}
