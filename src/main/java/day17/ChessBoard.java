package day17;

public class ChessBoard {
    private ChessPiece[][] board = new ChessPiece[8][8];

    ChessBoard(ChessPiece[][] board) {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                this.board[i][j] = board[i][j];
            }
        }
    }

    public void print() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
