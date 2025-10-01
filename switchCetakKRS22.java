import java.util.Scanner;

public class switchCetakKRS22 {
    public static void main(String[] args) {
        int uktStatus = 1; // 1 untuk lunas, 0 untuk belum lunas

        System.out.println("---Cetak KRS Siakad---");
        System.out.print("Apakah UKT sudah lunas? (1 untuk ya, 0 untuk tidak): ");

        Scanner sc = new Scanner(System.in);
        uktStatus = sc.nextInt();

        switch (uktStatus) {
            case 1:
                System.out.println("Pembayaran UKT Terverivikasi");
                System.out.println("silahkan cetak KRS dan minta tanda tangan DPA");
                break;
            case 0:
                System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
                break;
            default:
                System.out.println("Input tidak valid. Masukkan 1 untuk ya atau 0 untuk tidak.");
                break;
        }
    }
}