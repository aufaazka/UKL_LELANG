    
package ukl2022;

import java.util.ArrayList;
public class Petugas implements User{

   
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Petugas(){
        this.namaPetugas.add("Suparno");
        this.alamat.add("Surabaya");
        this.telepon.add("08234567890");
        
         this.namaPetugas.add("Adi");
        this.alamat.add("Klakah");
        this.telepon.add("08234567234352");
        
          this.namaPetugas.add("Kana");
        this.alamat.add("Solo");
        this.telepon.add("082345672323");
}
    public int getJumlahPetugas(){
        return this.namaPetugas.size();
    }
    @Override
    public void setNama(String namaPetugas){
        this.namaPetugas.add(namaPetugas);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelephone(String telepon){
        this.telepon.add(telepon);
    }
    
    @Override
    public String getNama(int id){
        return this.namaPetugas.get(id);
    }
    @Override
    public String getAlamat(int id){
        return this.alamat.get(id);
    }
    @Override
    public String getTelephone(int id){
        return this.telepon.get(id);
    }
}