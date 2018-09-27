package pacman;

/**
 * @generated
 */

public class Pill extends Character
{
	private boolean power;
	private boolean eaten;
	private Tile position;	
	
	public Pill(int x, int y, boolean power) {
            super();
            this.x = x;
            this.y = y;
            this.power = power;
	}

    public boolean isPower() {
        return power;
    }
}

