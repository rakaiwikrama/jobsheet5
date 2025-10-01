import java.util.Scanner;

public class nestedUjianSkripsi22 {
    Scanner sc = new Scanner(System.in);
    String pesan;

    System.out.println("apakah mahasiswa sudah bebas kompen ? (Ya atau tidak): ");
    String bebasKompen= sc.nextLine();

    System.out.print("masukan jumla log bimbingan pembimbing 1: ");
    int bimbinganP1 = sc.nextInt();
    System.out.print("masukan jumla log bimbingan pembimbing 2: ");
    int bimbinganP2 = sc.nextInt();

    if (bebasKompen.equalsIgnoreCase("Ya")) {
        if (bimbinganP1 >= 3 && bimbinganP2 >= 4) {
            pesan = "Semua syarat terpenuhi. mahasiswa boleh mendaftar Ujian Skripsi";
        } else if (bimbinganP1 < 8 && bimbinganP2 < 4){
            pesan = "Gagal! log bimbingan pembimbing 1 kurang dari 8 kali dan P2 kurang dari 4 kali";
        } else if (bimbinganP1 < 8) {
            pesan = "Gagal! log bimbingan pembimbing 1 kurang dari 8 kali";
        }
    } else {
        pesan = "Gagal! mahasiswa masih memiliki tanggungan kompen";
    }

    System.out.println(pesan);
}