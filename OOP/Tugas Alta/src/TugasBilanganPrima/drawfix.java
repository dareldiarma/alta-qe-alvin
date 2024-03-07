package TugasBilanganPrima;

public class drawfix {
    public static void drawxyz(int height) {
        int count = 0;
        for (int i = 1; i<= height; i++) {
            for (int j =1; j <= height; j++) {
                count += 1;
                if (count % 3 == 0) {
                    System.out.print("X ");
                }else {
                    if (count % 2 != 0) {
                        System.out.print("Y ");
                    } else {
                        System.out.print("Z ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hasil pattern untuk height 5:");
        drawxyz(5);
        System.out.println("Hasil pattern untuk height 9:");
        drawxyz(9);
    }
}
