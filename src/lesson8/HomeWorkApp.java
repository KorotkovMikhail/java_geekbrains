package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWorkApp {
    private static final int SIZE = 5;
    private static final char[][] map = new char[SIZE][SIZE];
    private static boolean player = true;
    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';


    static class MyWindow extends JFrame {

        private static final String DRAW_EMPTY = "DRAW_EMPTY";
        private static final String DRAW_X = "DRAW_X";
        private static final String DRAW_O = "DRAW_O";

        public void initMap() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                    add(createButton(i,j));

                }
            }

        }

        public MyWindow() {
            setBounds(500, 400, 500, 500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new GridLayout(SIZE, SIZE));
            initMap();


            setVisible(true);
        }

        private JButton createButton(int i, int j) {
            return new JButton() {

                {
                    setActionCommand(DRAW_EMPTY);
                    addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String action;
                            if (player&&getActionCommand().equals(DRAW_EMPTY)) {
                                action = DRAW_X;
                                map[i][j] = DOT_X;
                                player = false;
                                Turn.changerPlayer(2);
                                setActionCommand(action);
                                if (isWin(DOT_X)) {
                                    new Win("1");
                                }
                                if (isMapFull()) {
                                    new Win("Ничья");
                                }

                            } else if ((!player)&&getActionCommand().equals(DRAW_EMPTY)){
                                action = DRAW_O;
                                map[i][j] = DOT_O;
                                player = true;
                                Turn.changerPlayer(1);
                                setActionCommand(action);
                                if (isWin(DOT_O)) {
                                    new Win("2");
                                }
                                if (isMapFull()) {
                                    new Win("Ничья");
                                }
                            }
                        }
                    });
                }

                @Override
                public void paint(Graphics graphics) {
                    super.paint(graphics);
                    if (getActionCommand().equals(DRAW_O)) {
                        graphics.setColor(Color.RED);
                        graphics.fillOval(5, 5, this.getWidth()-10, this.getWidth()-15);
                    }
                    else if (getActionCommand().equals(DRAW_X)){
                        Graphics2D g2d = (Graphics2D) graphics;
                        g2d.setStroke(new BasicStroke(10));
                        g2d.setColor(Color.BLUE);
                        g2d.drawLine(10, 10, this.getWidth()-10, this.getHeight()-10);
                        g2d.drawLine(this.getWidth()-10, 10,  10, this.getHeight()-10);
                    }
                }
            };

        }

    }


    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Turn(1);
            }
        });
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyWindow();
            }
        });

    }



    private static boolean isWin(char symbol) {
        for (int x = 0; x<SIZE; x++){
            for (int y=0; y<SIZE; y++){
                if(y<=SIZE-4) {
                    for (int i = 0; i < 4; i++) {
                        if (map[x][y + i] != symbol) {
                            break;
                        }
                        if (i == 3) {
                            return true;
                        }
                    }
                }
                if(x<=SIZE-4) {
                    for (int i = 0; i < 4; i++) {
                        if (map[x+i][y] != symbol) {
                            break;
                        }
                        if (i == 3) {
                            return true;
                        }
                    }
                }
                if(y<=SIZE-4 && x<=SIZE-4) {
                    for (int i = 0; i < 4; i++) {
                        if (map[x+i][y + i] != symbol) {
                            break;
                        }
                        if (i == 3) {
                            return true;
                        }
                    }
                }
                if(y>=SIZE-2 && x<=SIZE-4) {
                    for (int i = 0; i < 4; i++) {
                        if (map[x+i][y - i] != symbol) {
                            break;
                        }
                        if (i == 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
