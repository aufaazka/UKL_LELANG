
package ukl2022;


public class Laporan {
public void laporan(Barang barang){
        int x = barang.getJumlahBarang();
        
        System.out.println(" ");
        System.out.println("Tabel Barang Yang Dilelang");
        System.out.println("ID \tNama Barang \tHarga \tStatus");
        for(int i=0; i<x; i++){
            System.out.println(i + ".\t" + barang.getNamaBarang(i) + "\t" + "\t" + "Rp." + barang.getHargaAwal(i) + "\t" + barang.getStatus(i));
            
        }
    }
    
    public void laporan(Masyarakat masyarakat, Barang barang) {
        int x = masyarakat.getJumlahMasyarakat();

    }
    
    public void laporan(Petugas petugas) {
        int x = petugas.getJumlahPetugas();

   
        System.out.println("================TABEL PETUGAS================");
        System.out.println("ID Nama\t\tAlamat\t\tTelepon \n"
                         + "1."+petugas.getNama(0) + "\t"+petugas.getAlamat(0)+"\t\t"+petugas.getTelephone(0)
                         + "\n2."+petugas.getNama(1) + "\t\t"+petugas.getAlamat(1)+"\t\t"+petugas.getTelephone(1)
                         + "\n3."+petugas.getNama(2) + "\t\t"+petugas.getAlamat(2)+"\t\t"+petugas.getTelephone(2)
                
                       
        );
         
    }

    public void laporan(Masyarakat masyarakat) {
        int x = masyarakat.getJumlahMasyarakat();

        
    }


}