
package ukl2022;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Lelang lelang = new Lelang();
        Laporan laporan = new Laporan();

        int id;
        int confirm;
        do {
            System.out.println("================================"
                    + "\nSELAMAT DATANG DIAPLIKASI LELANG "
                    + "\n================================");
            System.out.println("Menu : \n1. Lelang \n2. Keluar");
            System.out.print("Pilihan Anda :");
            confirm = input.nextInt();
            if (confirm == 1) {
                laporan.laporan(petugas);
                System.out.print("Masukkan ID Petugas : ");
                id = input.nextInt();
                if (id < 1 || id > 3) {
                    System.out.println("ID petugas tidak ditemukan");
                } else {
                    System.out.println("Selamat datang " + petugas.getNama(id - 1));
                    System.out.println("");
                    Barang barang = new Barang();
                    laporan.laporan(masyarakat);
                    lelang.prosesLelang(petugas, masyarakat, lelang, barang, laporan);
                    laporan.laporan(barang);
                }
            }
        } while (confirm != 2);
                        
    }

}
