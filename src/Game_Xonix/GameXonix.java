package Game_Xonix;

/**
 * Created by Sukora Stas.
 *
 * @author Stas Sukora
 * Java. Game Xonix
 */

import javax.swing.*;
import java.awt.*;
import java.util.Random;


class GameXonix extends JFrame {

    final String TITLE_OF_PROGRAM = "Xonix";
    final int POINT_SIZE = 10;
    final int FIELD_WIDTH = 640 / POINT_SIZE;
    final int FIELD_HEIGHT = 460 / POINT_SIZE;
    final int FIELD_DX = 6;
    final int FIELD_DY = 28 + 28;
    final int START_LOCATION = 200;
    final int LEFT = 37; // key codes
    final int UP = 38;
    final int RIGHT = 39;
    final int DOWN = 40;
    final int SHOW_DELAY = 60; // delay for animation
    final int COLOR_TEMP = 1; // for temporary filling
    final int COLOR_WATER = 0;
    final int COLOR_LAND = 0x00a8a8;
    final int COLOR_TRACK = 0x901290;
    final int PERCENT_OF_WATER_CAPTURE = 75;
    final String FORMAT_STRING = "Score: %d %20s %d %20s %2.0f%%";
    final Font font = new Font("", Font.BOLD, 21);
    Random random = new Random();
    Canvas canvas = new Canvas();
    JLabel board = new JLabel();
    Delay delay = new Delay();
    Field field = new Field();
    Xonix xonix = new Xonix();
    Balls balls = new Balls();
    //    Cube cube = new Cube();
    GameOver gameover = new GameOver();

    public static void main(String[] args) {
        new GameXonix().go();
    }

    GameXonix() {

    }

    void go() {

    }

    class Field{
        void paint(Graphics g) {

        }
    }

    class Xonix{
        void paint(Graphics g) {

        }
    }

    class Balls{
        void paint(Graphics g) {

        }
    }

    class Ball{
        void paint(Graphics g) {

        }
    }


    class Delay {
        void wait(int milliseconds) {
            try {
                Thread.sleep(milliseconds);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class GameOver {
        private final String GAME_OVER_MSG = "GAME OVER";
        private boolean gameOver;

        boolean isGameOver() {
            return gameOver;
        }

        void paint(Graphics g) {
            if (xonix.getCountLives() == 0) {
                gameOver = true;
                g.setColor(Color.white);
                g.setFont(new Font("", Font.BOLD, 60));
                FontMetrics fm = g.getFontMetrics();
                g.drawString(GAME_OVER_MSG, (FIELD_WIDTH * POINT_SIZE + FIELD_DX - fm.stringWidth(GAME_OVER_MSG)) / 2, (FIELD_HEIGHT * POINT_SIZE) / 2);
            }
        }
    }

    class Canvas extends JPanel { // my canvas for painting
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            field.paint(g);
            xonix.paint(g);
            balls.paint(g);
//            cube.paint(g);
            gameover.paint(g);
        }
    }
}

