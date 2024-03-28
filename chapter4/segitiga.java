package chapter4;

import java.util.Scanner;

public class segitiga {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input= new Scanner(System.in);
        System.out.print("Masukan Alas: ");
        double alas=input.nextDouble();
        System.out.print("Masukan Tinggi: ");
        double tinggi=input.nextDouble();
        System.out.println("Luas dari segitiga adalah: "+(alas*tinggi)/2);
    }
}
