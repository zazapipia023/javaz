package day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12, n = 8, max = -1, ind = 0, sum = 0;
        int[][] matrica = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrica[i][j] = (int)(Math.random() * 50);
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                sum = sum + matrica[i][j];
            }
            if(sum > max) {
                max = sum;
                sum = 0;
                ind = i;
            } else {
                sum = 0;
            }
        }

        System.out.println(ind + " " + max);
    }
}
