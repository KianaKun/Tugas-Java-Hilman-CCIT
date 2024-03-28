package chapter1;

public class lingkaran {

    private double jariJari;
  
    public lingkaran(double jariJari) {
      this.jariJari = jariJari;
    }
  
    public double hitungLuas() {
      final double PI = 3.141592653589793;
      return PI * Math.pow(jariJari, 2);
    }
  
    public static void main(String[] args) {
      double jariJari = 11.78;
      lingkaran bulat = new lingkaran(jariJari);
      
      double luas = bulat.hitungLuas();
  
      System.out.println("Luas lingkaran dalam bentuk pecahan: " + luas);
      System.out.println("Luas lingkaran dalam bentuk bulat: " + Math.round(luas));
      System.out.println("Luas lingkaran dalam bentuk pembulatan: " + String.format("%.2f", luas));
    }
  }
  