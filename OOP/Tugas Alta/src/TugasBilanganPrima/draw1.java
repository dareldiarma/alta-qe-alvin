package TugasBilanganPrima;

public class draw1 {
        public static void main(String[] args) {
            drawXYZ(5);
        }

        public static void drawXYZ(int height) {
            char[] symbols = {'X', 'Y', 'Z'};
            int symbolIndex = 0;

            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= height; j++) {
                    if (i % 3 == 0 && j % 3 == 0) {
                        System.out.print("X ");
                    } else if (i % 2 != 0 && j % 2 != 0) {
                        System.out.print("Y ");
                    } else if (i % 2 == 0 && j % 2 == 0) {
                        System.out.print("Z ");
                    }
                }
                System.out.println();
            }
        }
}
