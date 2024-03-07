package TugasBilanganPrima;

public class drawing {
    public static void drawxyz(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.println("Z");
                } else {
                    if (i % 2 != 0) {
                        System.out.println("Y");
                    } else {
                        if (i % 3 == 0)
                            System.out.println("X");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("drawingnya");
        drawxyz(5);
    }
}
