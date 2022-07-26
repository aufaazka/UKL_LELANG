
package ukl2022;
import java.util.ArrayList;

public class Masyarakat implements User{
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Masyarakat(){
        //id 0
        this.namaMasyarakat.add("Rani");
        this.alamat.add("Banyuwangi");
        this.telepon.add("085156160115");
        
        //id 1
        this.namaMasyarakat.add("Dono");
        this.alamat.add("Bali");
        this.telepon.add("082321210150");
        
    }
    
    public int getJumlahMasyarakat(){
        return  this.namaMasyarakat.size();
    }
    
    @Override
    public void setNama(String namaMasyarakat){
        this.namaMasyarakat.add(namaMasyarakat);
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
        return this.namaMasyarakat.get(id);
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
