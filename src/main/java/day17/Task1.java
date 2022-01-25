package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] mass = new ChessPiece[8];
        for(int i = 0; i < 4; i++) {
            mass[i] = ChessPiece.PAWN_WHITE;
            for(int j = 4; j < 8; j++) {
                mass[j] = ChessPiece.ROOK_BLACK;
            }
        }

        for(int i = 0; i < 8; i++) {
            System.out.print(mass[i].toString());
        }

    }
}