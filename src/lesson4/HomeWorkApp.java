package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class HomeWorkApp {

        private static final int SIZE = 5;

        private static final char DOT_EMPTY = '•';
        private static final char DOT_X = 'X';
        private static final char DOT_O = 'O';

        private static final char[][] map = new char[SIZE][SIZE];


        public static void main(String[] args) {
            initMap();
            printMap();

            while (true) {
                humanTurn();
                printMap();
                if (isWin(DOT_X)) {
                    System.out.println("Человек победил!");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья!");
                    break;
                }

                computerTurn();
                printMap();
                if (isWin(DOT_O)) {
                    System.out.println("Компьютер победил!");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья!");
                    break;
                }
            }
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


        // TODO: refactor this code using for loops
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
               }
           }
            return false;
        }

        private static void printMap() {
            printHeader();
            printBody();
            System.out.println();
        }

        private static void computerTurn() {
            int x;
            int y;
            Random random = new Random();
            for (int xHuman = 0; xHuman < SIZE; xHuman++) {
                for (int yHuman = 0; yHuman < SIZE; yHuman++) {
                      if(map[xHuman][yHuman] == DOT_EMPTY) {
                          map[xHuman][yHuman] = DOT_X;
                          if (isWin(DOT_X)) {
                              map[xHuman][yHuman] = DOT_O;
                              return;
                          }
                          map[xHuman][yHuman] = DOT_EMPTY;
                      }
                }
            }
                    do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (map[x][y] != DOT_EMPTY);

            map[x][y] = DOT_O;
        }

        private static void humanTurn() {
            int x;
            int y;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Введите координаты в формате X Y");
                x = readInt(scanner) - 1;
                y = readInt(scanner) - 1;

                if (x == -1 || y == -1) {
                    System.out.println("Координаты должны быть числом!");
                    scanner.nextLine();
                } else if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                    System.out.println("Данные введены некорректно!");
                } else if (map[x][y] != DOT_EMPTY) {
                    System.out.println("Клетка уже занята!");
                } else {
                    break;
                }
            } while (true);

            map[x][y] = DOT_X;
        }

        private static int readInt(Scanner scanner) {
            return scanner.hasNextInt() ? scanner.nextInt() : -1;
//        if (scanner.hasNextInt()) {
//            return scanner.nextInt();
//        } else {
//            return -1;
//        }
        }

        private static void printBody() {
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }

        private static void printHeader() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        private static void initMap() {
            for (int i = 0; i < SIZE; i++) {
                Arrays.fill(map[i], DOT_EMPTY);
            }

        }


}
