package hai;

import java.util.Scanner;

public class input {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan Nama Anda: ");
        String nama= masukan.nextLine();
        System.out.println("Halo, Nama saya "+nama);
    }
}
