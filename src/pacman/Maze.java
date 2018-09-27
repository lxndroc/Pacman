package pacman;

import java.util.ArrayList;

public class Maze extends Character {

    public int WIDTH;
    public int HEIGHT;
    public ArrayList<Tile> tiles;
    public ArrayList<Pill> pills;
    public ArrayList<Character> characters;
    public int fps;

    public Maze() {
        super();
        tiles = new ArrayList<Tile>();
        createTiles();
        pills = new ArrayList<Pill>();
        createPills();
        characters = new ArrayList<Character>();
        createCharacters();
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public ArrayList<Pill> getPills() {
        return pills;
    }

    public void createTiles() {
//        if () {
//            tile.setWall(true);
//        }
    }

    public void createPills() { //Coordinates for pills
        int align = 3;
        int pillX, pillY;
        for (int row = 0; row < 36; ++row) {
            for (int col = 0; col < 28; ++col) {
                if (row > 3 && row < 33 && col != 0 && col != 27) // remove 4 top &
                // 3 bottom rows, 1st & last columns
                // r: 4-32 (29) c: 1-26 (26)
                // power pills (6,1), (6,26), (26,1), (26,26)
                {
                    if ((row == 6 || row == 26) && (col == 1 || col == 26)) {
                        pillX = 8 * col + align - 2;
                        pillY = 8 * row + align - 2;
                        pills.add(new Pill(pillX, pillY, true));
                    } // regular pills
                    else {
                        pillX = 8 * col + align;
                        pillY = 8 * row + align;
//                        if (!Tile.isWall())
                            pills.add(new Pill(pillX, pillY, false));
                    }
                }
            }
        }
    }
    
    public void createCharacters() {
        //characters.add(new Pacman());
        //characters.add(new Ghost());
    }
}
