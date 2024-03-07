package Easychalange;

public class Hargakirimbarang {
    public static void main(String[] args){
        int panjang = 5;
        int lebar = 2;
        int tinggi = 4;
        int berat = 1;
        int volume = panjang * lebar * tinggi;
        int hargakirim = hitungharga(volume, berat);
        System.out.println("Harga pengiriman barang adalah Rp" + hargakirim);
    }
    public static int hitungharga(int volume, int berat) {
        int volumeminimal = 50;
        int beratminimal = 1;
        int hargastandar = 5000;
        if (volume <= volumeminimal && berat <= beratminimal) {
            return hargastandar;
        } else {
            return 0;
        }
    }
}
