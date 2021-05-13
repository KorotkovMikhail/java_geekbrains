package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWorkApp {
    static class MyWindow extends JFrame {

        private static final String DRAW_X = "DRAW_X";
        private static final String DRAW_O = "DRAW_O";

        private static final int SIZE = 5;
        private static final char DOT_EMPTY = '•';
        private static final char DOT_X = 'X';
        private static final char DOT_O = 'O';

        public MyWindow() {
            setSize(500,500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            setLayout(new GridLayout(SIZE, SIZE));
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());
            add(createButton());

            setVisible(true);
        }

        private JButton createButton() {
            return new JButton() {

                {
                    setActionCommand(DRAW_O);
                    addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String action = getActionCommand().equals(DRAW_O) ? DRAW_X : DRAW_O;
                            setActionCommand(action);
                        }
                    });
                }

                @Override
                public void paint(Graphics graphics) {
                    super.paint(graphics);

                    if (getActionCommand().equals(DRAW_O)) {
                        graphics.drawOval(0, 0, this.getWidth(), this.getWidth());
                        graphics.setColor(Color.RED);
                        graphics.fillOval(0, 0, this.getWidth(), this.getWidth());
                    }
                    else {
                        Graphics2D g2d = (Graphics2D) graphics;
                        g2d.setStroke(new BasicStroke(10));
                        g2d.setColor(Color.BLUE);
                        g2d.drawLine(0, 0, this.getWidth(), this.getHeight());
                        g2d.drawLine(this.getWidth(), 0,  0, this.getHeight());
                    }
                }
            };

        }

    }


    public static void main(String[] args){
        new MyWindow();
    }

}
