package pacman;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
//import java.awt.Rectangle;
import java.awt.image.BufferStrategy;

/**
 * Display class.
 *
 */
public class View extends Canvas {

    //public static final boolean DRAW_COLLIDER = false;
//    private Game game;
    private boolean running;
    private BufferStrategy bs;
    private Maze maze;

//    public double x, y;
    private int xScale = 2, yScale = 2; //enlargement factors
/*    public boolean visible = true;
    public BufferedImage frame;
    public BufferedImage[] frames;
    //public Rectangle collider;*/
    public BitmapFontRenderer bitmapFontRenderer = new BitmapFontRenderer("/res/font8x8.png", 16, 16);

    protected int instructionPointer;
    protected long waitTime;

    public View() {
//                    System.out.println("Inside");
        maze = new Maze();
//        this.game = game;
        int xDim = 224;//(int) (game.screenSize.width * game.screenScale.getX());
        int yDim = 288;//(int) (game.screenSize.height * game.screenScale.getY());
        setPreferredSize(new Dimension(xDim * xScale, yDim * yScale)); //set canvas size enlarged by 2 in both x & y
//        addKeyListener(new Keyboard());
    }

    public void start() {
        if (running) {
            return;
        }
        createBufferStrategy(2);
        bs = getBufferStrategy();
//        game.init();
        running = true;
        Thread thread = new Thread(new MainLoop());
        thread.start();
    }

    private class MainLoop implements Runnable { // inner class implementing Runnable interface, hence working as a thread

        @Override
        public void run() {
            long desiredFrameRateTime = 1000 / 60;
            long currentTime = System.currentTimeMillis();
            long lastTime = currentTime - desiredFrameRateTime;
            long unprocessedTime = 0;
            boolean needsRender = false;
            while (running) {
                currentTime = System.currentTimeMillis();
                unprocessedTime += currentTime - lastTime;
                lastTime = currentTime;

                while (unprocessedTime >= desiredFrameRateTime) {
                    unprocessedTime -= desiredFrameRateTime;
                    //update();
                    needsRender = true;
                }

                if (needsRender) {
                    Graphics2D g = (Graphics2D) bs.getDrawGraphics();
                    g.setBackground(Color.BLACK);
                    g.clearRect(0, 0, getWidth(), getHeight());
                    g.scale(xScale, yScale); // enlarge image put on the canvas
//                    displayText(g, "PUSH SPACE TO START", 37, 170);
                    displayMaze(g);
                    displayPills(g);
                    g.dispose();
                    bs.show();
                    needsRender = false;
                } else {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                    }
                }
            }
        }
    }

    public void displayMaze(Graphics2D g) {
        maze.loadFrames(maze, "/res/background_0.png", "/res/background_1.png");
        displayImage(maze, g);
    }

    public void displayPills(Graphics2D g) {
        int align = 3;
        g.setColor(Color.WHITE);
        for (Pill pill : maze.getPills()) {
            if (pill.isPower()) {
                g.setColor(Color.ORANGE);
                g.fillOval(pill.getX(), pill.getY(), 6, 6);
                g.setColor(Color.WHITE);
            } // regular pills
            else {
                g.fillRect(pill.getX(), pill.getY(), 2, 2);
            }
        }
    }

    public void displayImage(Character character, Graphics2D g) {
        if (!character.isVisible()) {
            return;
        }

        if (character.getFrame() != null) {
            g.drawImage(character.getFrame(), character.getX(), character.getY(), character.getFrame().getWidth(), character.getFrame().getHeight(), null);
        }
        /*        if (DRAW_COLLIDER && collider != null) {
            updateCollider();
            g.setColor(Color.RED);
            g.draw(collider);
        }*/
    }

    public void displayText(Graphics2D g, String text, int x, int y) {
        bitmapFontRenderer.drawText(g, text, x, y);
    }

    public void displayTile() {
        // TODO implement me
    }

    public void displayCharacter() {
        // TODO implement me
    }

    public void displayHighScores() {
        // TODO implement me
    }

    public void displayScore() {
        // TODO implement me
    }
}
