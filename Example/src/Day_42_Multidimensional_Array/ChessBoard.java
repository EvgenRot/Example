package Day_42_Multidimensional_Array;

public class ChessBoard {
    public static void main(String[] args) {

        String[][] chessBoard = new String[8][7];
        for (int i = 0; i < chessBoard.length; i++) {
            System.out.println('\n');
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) {			// (num & 1) != 0; проверка на нечетность и неотрицательность
                    System.out.print("[W] ");
                }else {
                    System.out.print("[B] ");
                }
            }
        }
    }
}
