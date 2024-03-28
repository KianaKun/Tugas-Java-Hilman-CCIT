package chapter5;

import java.util.Scanner;

public class inputNama {
    private String FullName;
    private int panjangBlkg;

    public void inputNama() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap Anda: ");
        FullName = scanner.nextLine();
    }

    public void inputPanjangBelakang() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berapa panjang karakter nama belakang Anda: ");
        panjangBlkg = scanner.nextInt();
    }

    public void tampilkanNamaBelakang() {
        if (FullName.length() > panjangBlkg) {
            String namaBelakang = FullName.substring(FullName.length() - panjangBlkg);
            System.out.println("Nama belakang Anda adalah: " + namaBelakang);
        } else {
            System.out.println("Panjang karakter nama belakang melebihi panjang nama lengkap Anda.");
        }
    }

    public static void main(String[] args) {
        inputNama inputNamaObj = new inputNama();
        inputNamaObj.inputNama();
        inputNamaObj.inputPanjangBelakang();
        inputNamaObj.tampilkanNamaBelakang();
    }
}
