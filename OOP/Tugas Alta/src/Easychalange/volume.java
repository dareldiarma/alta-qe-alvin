package Easychalange;

public class volume {
    public static void main(String[] args) {
        double sisiKubus = 10;

        double panjangbalok = 10;
        double lebarbalok = 6;
        double tinggibalok= 3;

        double jaritabung = 7;
        double tinggitabung = 10;

        hitungVolume(sisiKubus, panjangbalok, lebarbalok,tinggibalok, jaritabung, tinggitabung);
    }
    public static void hitungVolume(double sisikubus, double panjangbalok, double lebarbalok, double tinggibalok, double jaritabung, double tinggitabung) {
        double volumepersegi = sisikubus * sisikubus * sisikubus;
        double volumebalok = panjangbalok * lebarbalok * tinggibalok;
        double volumetabung = ((22 * jaritabung * jaritabung) / 7) * tinggitabung;
        System.out.println("Volume Persegi= " + volumepersegi);
        System.out.println("Volume Balok= " + volumebalok);
        System.out.println("Volume Tabung= " + volumetabung);
    }
}
