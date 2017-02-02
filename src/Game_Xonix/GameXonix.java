package Game_Xonix;

/**
 * Created by Sukora Stas.
 *
 * @author Stas Sukora
 * Java. Game Xonix
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
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
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //отрисовка местоположения окна
        setBounds(START_LOCATION, START_LOCATION, FIELD_WIDTH * POINT_SIZE + FIELD_DX, FIELD_HEIGHT * POINT_SIZE + FIELD_DY);
        setResizable(false); //не изменный размер
        board.setFont(font);
        board.setOpaque(true);
        board.setBackground(Color.black);
        board.setForeground(Color.white);
        board.setHorizontalAlignment(JLabel.CENTER);
        add(BorderLayout.CENTER, canvas);
        add(BorderLayout.SOUTH, board);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() >= LEFT && e.getKeyCode() <= DOWN)
                    xonix.setDirection(e.getKeyCode());
            }
        });
        setVisible(true);
    }

    void go() {
        while (!gameover.isGameOver()) {
            xonix.move();
            balls.move();
//            cube.move();
            canvas.repaint();
            board.setText(String.format(FORMAT_STRING, field.getCountScore(), "Xn:", xonix.getCountLives(), "Full:", field.getCurrentPercent()));
            delay.wait(SHOW_DELAY);
            if (xonix.isSelfCrosed() || balls.isHitTrackOrXonix()) {//|| cube.isHitXonix()
                xonix.decreaseCountLives();
                if (xonix.getCountLives() > 0) {
                    xonix.init();
                    field.clearTrack();
                    delay.wait(SHOW_DELAY * 10);
                }
            }
            if (field.getCurrentPercent() >= PERCENT_OF_WATER_CAPTURE) {
                field.init();
                xonix.init();
//                cube.init();
                balls.add();
                delay.wait(SHOW_DELAY * 10);
            }
        }
    }

    class Field {
        void paint(Graphics g) {

        }
    }

    class Xonix {
        void setDirection(int direction) {

        }

        int getCountLives() {
            return 1;
        }

        void paint(Graphics g) {

        }
    }

    class Balls {
        private ArrayList<Ball> balls = new ArrayList<Ball>();

        Balls() {
            add();
        }

        void add() {
            balls.add(new Ball());
        }

        void move() {
            for (Ball ball : balls) ball.move();
        }

        ArrayList<Ball> getBalls() {
            return balls;
        }

        boolean isHitTrackOrXonix() {
            for (Ball ball : balls) if (ball.isHitTrackOrXonix()) return true;
            return false;
        }

        void paint(Graphics g) {
            for (Ball ball : balls) ball.paint(g);
        }
    }

    class Ball {
        private int x, y, dx, dy;

        Ball() {
            do {
                x = random.nextInt(FIELD_WIDTH);
                y = random.nextInt(FIELD_HEIGHT);
            } while (field.getColor(x, y) > COLOR_WATER);
            dx = random.nextBoolean() ? 1 : -1;
            dy = random.nextBoolean() ? 1 : -1;
        }

        void updateDXandDY() {
            if (field.getColor(x + dx, y) == COLOR_LAND) dx = -dx;
            if (field.getColor(x, y + dy) == COLOR_LAND) dy = -dy;
        }

        void move() {
            updateDXandDY();
            x += dx;
            y += dy;
        }

        int getX() {
            return x;
        }

        int getY() {
            return y;
        }

        boolean isHitTrackOrXonix() {
            updateDXandDY();
            if (field.getColor(x + dx, y + dy) == COLOR_TRACK) return true;
            if (x + dx == xonix.getX() && y + dy == xonix.getY()) return true;
            return false;
        }

        void paint(Graphics g) {
            g.setColor(Color.white);
            g.fillOval(x * POINT_SIZE, y * POINT_SIZE, POINT_SIZE, POINT_SIZE);
            g.setColor(new Color(COLOR_LAND));
            g.fillOval(x * POINT_SIZE + 2, y * POINT_SIZE + 2, POINT_SIZE - 4, POINT_SIZE - 4);
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

