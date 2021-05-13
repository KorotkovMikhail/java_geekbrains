package lesson8;

import javax.swing.*;
import java.awt.*;

public class Turn extends JFrame {
    private static int player;
    public static JLabel PlayerView;
    public Turn(int player) {
        this.player = player;
        setBounds(500, 300, 500, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        Font font = new Font("Arial", Font.BOLD, 32);

        PlayerView = new JLabel(String.valueOf("Ход игрока " + player));
        PlayerView.setHorizontalAlignment(SwingConstants.CENTER);
        PlayerView.setFont(font);
        add(PlayerView, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void changerPlayer(int turnPlayer) {
        PlayerView.setText(String.valueOf("Ход игрока " + turnPlayer));
    }
}
