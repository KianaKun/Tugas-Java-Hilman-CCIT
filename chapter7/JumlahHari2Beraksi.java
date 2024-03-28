package chapter7;

import java.util.Scanner;

public class JumlahHari2Beraksi {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        System.out.print("Masukkan bulan: ");
        int bulan = input.nextInt();

        try {
            int jumlahHari = JumlahHari2.hitungHari(tahun, bulan);
            System.out.printf("Jumlah hari pada tahun %d bulan %d adalah %d hari\n", tahun, bulan, jumlahHari);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}

