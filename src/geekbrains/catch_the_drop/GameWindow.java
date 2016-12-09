package geekbrains.catch_the_drop;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sukora Stas.
 */
public class GameWindow extends JFrame {

    private static GameWindow game_window;

    public static void main(String[] args) {
        game_window = new GameWindow();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //закрытие(остановка) приложения по крестику
        game_window.setLocation(550, 250);
        game_window.setSize(906, 478);
        game_window.setResizable(false);
        GameFields game_field = new GameFields();
        game_window.add(game_field);
        game_window.setVisible(true);
    }

    private static void onRepaint(Graphics g) {
        g.fillOval(10, 10, 200, 100);
        g.fillRect(150,150,100,2);
        g.drawLine(200,200,400,300);
    }

    private static class GameFields extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            onRepaint(g);
        }
    }


}


