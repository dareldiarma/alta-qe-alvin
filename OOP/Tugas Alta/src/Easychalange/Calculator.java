package Easychalange;

public class Calculator {
    public static void main(String[] args) {
        int angkapenjumlahan1 = 3;
        int angkapenjumlahan2 = 4;
        int angkapengurangan1 = 15;
        int angkapengurangan2 = 4;
        int angkaperkalian1 = 10;
        int angkaperkalian2 =10;
        int angkapembagian1 = 12;
        int angkapembagian2 = 3;
        hitungpenjumlahan(angkapenjumlahan1, angkapenjumlahan2);
        hitungpengurangan(angkapengurangan1, angkapengurangan2);
        hitungperkalian(angkaperkalian1, angkaperkalian2);
        hitungpembagian(angkapembagian1, angkapembagian2);
    }
    public static void hitungpenjumlahan(int angka1, int angka2) {
        int hasilpenjumlahan = angka1 + angka2;
        System.out.println("Hasil penjumlahan= " + hasilpenjumlahan);
    }
    public static void hitungpengurangan(int angkak1, int angkak2) {
        int hasilpengurangan = angkak1 - angkak2;
        System.out.println("Hasil pengurangan= " + hasilpengurangan);
    }
    public static void hitungperkalian(int angka1, int angka2) {
        int hasilperkalian = angka1 * angka2;
        System.out.println("Hasil perkalian= "+ hasilperkalian);
    }
    public static void hitungpembagian(int angka1, int angka2) {
        int hasilpembagian = angka1 / angka2;
        System.out.println("Hasil pembagian= " + hasilpembagian);
    }
}
