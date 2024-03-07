package TugasBilanganPrima;
import java.sql.SQLOutput;
public class BilanganPrima {
    public static String Prima(int number){
        String BPrima = "Bilangan Prima" ;
        String BBPrima = "Bukan Bilangan Prima" ;

        if (number <= 1){
            return BBPrima;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return BBPrima;
            }
        }
        return BPrima;
    }
    public static void main(String[] args) {
        System.out.println(Prima(7));
        System.out.println(Prima(10));
    }
}
