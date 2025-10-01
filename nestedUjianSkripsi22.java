import java.util.Scanner;

public class nestedUjianSkripsi22 {
    public static void main(String[] args) {
        String pesan = ""; 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Apakah mahasiswa sudah bebas kompen ? (Ya atau Tidak): ");
        String bebasKompen= sc.nextLine();
        
        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();
        
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar Ujian Skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4){
                pesan = "Gagal! log bimbingan pembimbing 1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! log bimbingan pembimbing 1 kurang dari 8 kali";
            } else if (bimbinganP2 < 4) {
                pesan = "Gagal! log bimbingan pembimbing 2 kurang dari 4 kali";
            }
        } else {
            pesan = "Gagal! mahasiswa masih memiliki tanggungan kompen";
        }
        
        System.out.println(pesan);
    }
}
