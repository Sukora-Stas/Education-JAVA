package geekbrains.catch_the_drop;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Sukora Stas.
 */
public class GameWindow extends JFrame {

    private static GameWindow game_window;
    private static Image bacground;
    private static Image game_over;
    private static Image drop;

    public static void main(String[] args) throws IOException {
        bacground = ImageIO.read(GameWindow.class.getResourceAsStream("background.png"));
        game_over = ImageIO.read(GameWindow.class.getResourceAsStream("game_over.png"));
        drop = ImageIO.read(GameWindow.class.getResourceAsStream("drop.png"));
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
        g.drawImage(bacground,0,0,null);
        g.drawImage(drop,100,100,null);
        g.drawImage(game_over,280,120,null);
    }

    private static class GameFields extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            onRepaint(g);
        }
    }


}


