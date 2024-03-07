package Easychalange;

public class Luasdankelilingmasing2 {
    public static void main(String[] args) {
        double sisiPersegi = 4;

        double alasSegitiga = 3;
        double tinggiSegitiga = 4;

        double panjangPersegiPanjang = 7;
        double lebarPersegiPanjang = 8;

        hitungKeliling(sisiPersegi, alasSegitiga,tinggiSegitiga, panjangPersegiPanjang, lebarPersegiPanjang);
        hitungluas(sisiPersegi, alasSegitiga,tinggiSegitiga, panjangPersegiPanjang, lebarPersegiPanjang);
    }
    public static void hitungKeliling(double sisi, double alas, double tinggi, double panjang, double lebar){
        double kelilingpersegi = 4 * sisi;
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        double kelilingsegitiga = alas + tinggi + sisiMiring;
        double kelilingpersegipanjang = 2 * (panjang + lebar);
        System.out.println("Keliling persegi: " + kelilingpersegi);
        System.out.println("Keliling segitiga: " + kelilingsegitiga);
        System.out.println("Keliling persegi panjang: " + kelilingpersegipanjang);
    }
    public static void hitungluas(double sisi, double alas, double tinggi, double panjang, double lebar) {
        double luaspersegi = sisi * sisi;
        double luassegitiga = 0.5 * alas * tinggi;
        double luaspersegipanjang = panjang * lebar;
        System.out.println("Luas persegi: " + luaspersegi);
        System.out.println("Luas segitiga: " + luassegitiga);
        System.out.println("Luas persegi panjang: " + luaspersegipanjang);

    }
}
