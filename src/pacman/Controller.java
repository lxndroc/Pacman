package pacman;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Controller {
    
    public List<Character> characters;

    public Controller() {
        SwingUtilities.invokeLater(() -> {
            Game game = new Game();
            View view = new View();
            characters = new ArrayList<Character>();
            JFrame frame = new JFrame();
            frame.setTitle("Pacman"); // sets the frame (window) title
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // normal close operation when clicking x
            frame.getContentPane().add(view); // adds the view (canvas) on the frame
            frame.pack(); // sizes the GUI components into their preferred size
            frame.setLocationRelativeTo(null); // centres the frame on the screen
            frame.setVisible(true); // shows the frame
            view.requestFocus(); // moves the input point to the canvas
            view.start();
        });
    }

    
    public void detectCharacter2Wall() {
        // TODO implement me
    }

    public void detectPacman2Ghost() {
        // TODO implement me
    }

    public void detectPacman2Pill() {
        // TODO implement me
    }

    public void detectAllPillsEaten() {
        // TODO implement me
    }

    public void detectKeys() {
        // TODO implement me
    }

}
