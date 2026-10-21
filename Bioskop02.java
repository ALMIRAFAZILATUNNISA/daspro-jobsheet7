import java.util.Scanner;

public class Bioskop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, totalTiket = 0;
        double hargaTiket = 50000, diskon, totalBayar, totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            totalBayar = jumlahTiket * hargaTiket * (1 - diskon);
            System.out.println("Total bayar pelanggan: Rp " + totalBayar);

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;
        } while (true);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
    }
}