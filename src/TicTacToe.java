import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;

        while (!gameOver) {

            gameBoard(board);
            System.out.print("Player " + player + ", enter row and column (0-2): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (board[row][col] == ' ') {

                board[row][col] = player;
                gameOver = gameWon(board, player);

                if (gameOver) {

                    gameBoard(board);
                    System.out.println("Player " + player + " wins!");

                } else {

                player =(player == 'X')? 'O': 'X';
                }

            } else {
                System.out.println("That spot is already taken. Try again.");
            }
        }

        sc.close();
    }

    public static boolean gameWon(char[][] board, char player) {

        for (int row = 0; row < 3; row++) {

            if (board[row][0] == player &&
                    board[row][1] == player &&
                    board[row][2] == player) {

                return true;
            }
        }

        for (int col = 0; col < 3; col++) {

            if (board[0][col] == player &&
                    board[1][col] == player &&
                    board[2][col] == player) {

                return true;
            }
        }

        if (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) {

            return true;
        }

        if (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player) {

            return true;
        }

        return false;
    }

    public static void gameBoard(char[][] board) {

        for (int row = 0; row < 3; row++) {

            System.out.println("-------------");

            for (int col = 0; col < 3; col++) {
                System.out.print("| " + board[row][col] + " ");
            }

            System.out.println("|");
        }

        System.out.println("-------------");
    }
}