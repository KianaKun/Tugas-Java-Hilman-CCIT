import java.util.Calendar;

public class numerik {

    public static void main(String[] args) {

    long n = 461012;

    System.out.format("%d%n", n);

    System.out.format("%08d%n", n);

    System.out.format("%+8d%n", n);

    System.out.format("%,8d%n", n);

    System.out.format("%+,8d%n%n", n);

    double pi = Math.PI;

    System.out.format("%f%n", pi);

    System.out.format("%.3f%n", pi);

    System.out.format("%10.3f%n", pi);

    System.out.format("%-10.3f%n", pi);

    Calendar c = Calendar.getInstance();

    System.out.format("%tB %te, %tY%n", c, c, c);

    System.out.format("%tl:%tM %tp%n", c, c, c);

    System.out.format("%tD%n", c);

    }

}
