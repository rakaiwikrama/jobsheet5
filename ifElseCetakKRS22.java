import java.util.Scanner;

public class ifElseCetakKRS22 {
    public static void main(String[] args) {
        int uktStatus = 1; // 1 lunas, 2 belum

        System.out.println("---Cetak KRS Siakad---");
        System.out.print("Apakah UKT sudah lunas? (1 untuk ya, 0 untuk tidak): ");

        Scanner sc = new Scanner(System.in);
        uktStatus = sc.nextInt();

        if (uktStatus == 1) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else if (uktStatus == 0) {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        } else {
            System.out.println("Input tidak valid. Masukkan 1 untuk ya atau 0 untuk tidak.");
        }
    }
}
