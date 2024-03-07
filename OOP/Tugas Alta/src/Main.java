import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nilai Mahasiswa");

        int nilai = Integer.parseInt(scanner.nextLine());
        int bbA = 80;
        int baA = 100;
        int bbBps = 65;
        int baBps = 79;
        int bbB = 50;
        int baB = 64;
        int bbC = 35;
        int baC = 49;
        int bbD = 0;
        int baD =34;
        if (nilai >= bbA && nilai <= baA) {
            System.out.println("Mendapat Nilai A");
        } else if (nilai >= bbBps && nilai <= baBps) {
            System.out.println("Mendapat nilai B+");
        } else if (nilai >= bbB && nilai <= baB) {
            System.out.println("Mendapat Nilai B");
        } else if (nilai >= bbC && nilai <= baC) {
            System.out.println("Mendapat Nilai C");
        } else if (nilai >= bbD && nilai <= baD) {
            System.out.println("Mendapat Nilai D");
        } else {
            System.out.println("Invalid");
        }
//        int bilangan = 20;
//        for (int i=bilangan; i >= 1; i--) {
//            if (bilangan % i == 0) {
//                System.out.println(i);
//            }
//        }
    }
}