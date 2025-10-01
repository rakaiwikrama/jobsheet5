import java.util.Scanner;

public class ifCetakKRS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---Cetak KRS Siakad---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        
        boolean uktLunas = sc.nextBoolean();

        System.out.println(
        uktLunas
         ?"Pembayaran UKT Terverivikasi, silahkan cetak KRS dan minta tanda tangan DPA"
        : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu"
        );
    }
}