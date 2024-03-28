package chapter7;

import java.util.Scanner;

public class calculator {
    @SuppressWarnings("unused")
    private int angka1;
    @SuppressWarnings("unused")
    private int angka2;
    @SuppressWarnings("unused")
    private int hasil;

    public void tambahan() {
        @SuppressWarnings("resource")
        Scanner input= new Scanner(System.in);
        System.out.print("Masukan Angka ke 1: ");
        angka1 = input.nextInt();
        System.out.print("Masukan Angka ke 2: ");
        angka2 = input.nextInt();
        hasil=angka1+angka2;
        System.out.println("Hasilnya adalah: "+ hasil);
    }
    
    public void pengurangan() {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka ke 1: ");
        angka1=input.nextInt();
        System.out.print("Masukan Angka ke 2: ");
        angka2=input.nextInt();
        hasil=angka1-angka2;
        System.out.println("Hasilnya adalah: "+ hasil);
        
    }
    
    public void perkalian() {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka ke 1: ");
        angka1=input.nextInt();
        System.out.print("Masukan Angka ke 2: ");
        angka2=input.nextInt();
        hasil=angka1*angka2;
        System.out.println("Hasilnya adalah: "+ hasil);
    }
    
    public void pembagian() {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka ke 1: ");
        angka1=input.nextInt();
        System.out.print("Masukan Angka ke 2: ");
        angka2=input.nextInt();
        hasil=angka1/angka2;
        System.out.println("Hasilnya adalah: "+ hasil);
    }

    public static void main(String[] args) {
        System.out.println("1.Pertambahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        @SuppressWarnings("resource")
        Scanner input= new Scanner(System.in);
        System.out.print("Masukan Pilihan Anda: ");
        String menu=input.nextLine();
        switch (menu) {
            case "1":
              calculator kalkulatorTambah = new calculator();
              kalkulatorTambah.tambahan();
              break;
            case "2":
              calculator kalkulatorKurang = new calculator();
              kalkulatorKurang.pengurangan();
              break;
            case "3":
              calculator kalkulatorKali = new calculator();
              kalkulatorKali.perkalian();
              break;
            case "4":
              calculator kalkulatorBagi = new calculator();
              kalkulatorBagi.pembagian();
              break;
            default:
              System.out.println("Pilihan tidak valid!");
        }
    }
}