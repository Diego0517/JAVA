public class TablasMultiplicar {
    public static void main(String[] args) {
        int[][] tablas = new int[101][101];

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                tablas[i][j] = i * j;
            }
        }

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                System.out.print(tablas[i][j] + "\t");
            }
            System.out.println();
        }
    }
}