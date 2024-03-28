package chapter7;

public class JumlahHari2 {

    public static int hitungHari(int tahun, int bulan) {
        int jumlahHari;
        switch (bulan) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                break;
            case 2:
                if (isKabisat(tahun)) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
            default:
                throw new IllegalArgumentException("Bulan tidak valid: " + bulan);
        }
        return jumlahHari;
    }

    private static boolean isKabisat(int tahun) {
        return (tahun % 4 == 0 && (tahun % 100 != 0 || tahun % 400 == 0));
    }
}

