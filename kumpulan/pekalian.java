package hai;

import java.util.Scanner;

public class pekalian {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input= new Scanner(System.in);
        System.out.println("Masukan Angka ke 1: ");
        int angka1=input.nextInt();
        System.out.println("Masukan Angka ke 2: ");
        int angka2=input.nextInt();
        System.out.println("Hasilnya adalah: "+(angka1*angka2));
    }
}