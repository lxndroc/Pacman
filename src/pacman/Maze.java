package pacman;

import java.util.ArrayList;

public class Maze extends Character {

    public int WIDTH;
    public int HEIGHT;
    //public ArrayList<Tile> tiles;
    public ArrayList<Character> characters;
    public ArrayList<Pill> pills;
    public int fps;

    public Maze() {
        super();
        characters = new ArrayList<Character>();
        createCharacters();
        pills = new ArrayList<Pill>();
        createPills();
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public ArrayList<Pill> getPills() {
        return pills;
    }

    public void createCharacters() {
        //characters.add(new Pacman());
        //characters.add(new Ghost());
    }

    public void createPills() {
        for (int row = 0; row < 31; row++) {
            for (int col = 0; col < 36; col++) {
                int pillX = col * 8 + 3 - 32;
                int pillY = (row + 3) * 8 + 3;
                pills.add(new Pill(pillX, pillY));
            }
        }
    }
}