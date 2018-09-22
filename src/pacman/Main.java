package pacman;

/**
 * Main class.
 *
 * @author ?Leonardo Ono (ono.leo@gmail.com)
 */
public class Main {

    public Controller controller;

    public Main() {
        super();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.controller = new Controller();
    }
}
