package lesson8;

import javax.swing.*;
import java.awt.*;


    public class Win extends JFrame {
        protected String winner;
        public Win(String winner) {
            this.winner = winner;
            setBounds(500, 200, 800, 800);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setAlwaysOnTop(true);
            String message = winner;
            Font font = new Font("Arial", Font.BOLD, 32);
            if (!winner.equals("Ничья")) {
                message = "Победил игрок " + winner;
            }
            JLabel counterValueView = new JLabel(String.valueOf(message));
            counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
            counterValueView.setFont(font);
            setAlwaysOnTop(true);
            add(counterValueView, BorderLayout.CENTER);
            setVisible(true);
        }
    }


