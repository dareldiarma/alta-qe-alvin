package Easychalange;

public class Luasdankeliling {
    public static void main(String[] args) {
        double sisiPersegi = 4;
        hitungPersegi(sisiPersegi);

        double alasSegitiga = 3;
        double tinggiSegitiga = 4;
        hitungSegitiga(alasSegitiga, tinggiSegitiga);

        double panjangPersegiPanjang = 7;
        double lebarPersegiPanjang = 8;
        hitungPersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
    }
    public static void hitungPersegi(double sisi) {
        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);
    }
    public static void hitungSegitiga(double alas, double tinggi) {
        double luas = 0.5 * alas * tinggi;
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        double keliling = alas + tinggi + sisiMiring;

        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);
    }
    public static void hitungPersegiPanjang(double panjang, double lebar) {
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
    }
}
