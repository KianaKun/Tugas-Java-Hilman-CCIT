package chapter6;

import java.text.DecimalFormat;

public class lingkaran {

    public static final double PI = 3.141592; // Declare PI as a constant

    public static double hitungLuas(double jariJari) {
        double luasLingkaran = PI * jariJari * jariJari;
        return luasLingkaran;
    }

    public static void main(String[] args) {
        double jariJari = 11.78; // Initialize radius value

        // Calculate area using the hitungLuas method
        double luas = hitungLuas(jariJari);

        // Format output to display two decimal places
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah:");
        System.out.println("- Bilangan pecahan: " + df.format(luas));

        // Cast to int for integer representation (round down)
        int luasInteger = (int) luas;
        System.out.println("- Bilangan bulat (type casting): " + luasInteger);

        // Round to nearest integer using Math.round()
        int luasBulat = (int) Math.round(luas);
        System.out.println("- Bilangan bulat (pembulatan): " + luasBulat);
    }
}
