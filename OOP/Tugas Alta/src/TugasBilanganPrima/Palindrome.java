package TugasBilanganPrima;

public class Palindrome {
    public static String isPalindrome(String kata) {
        String Kplndrm = kata + " adalah kata Palindrome";
        String Bkplndrm = kata + " bukan kata Palindrome";
        int panjangkata = kata.length();
        for (int i = 0; i < panjangkata / 2; i++) {
            if (kata.charAt(i) != kata.charAt(panjangkata - 1 - i)) {
                return Bkplndrm;
            }
        }
        return Kplndrm;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("katak"));
        System.out.println(isPalindrome("kupu-kupu"));
        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindrome("lion"));
    }
}
