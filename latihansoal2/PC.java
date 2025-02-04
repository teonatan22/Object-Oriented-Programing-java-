package pbo.latihansoal2;

public class PC extends Komputer {
    @Override
    public void hidupkan_os(){
        System.out.println("PC dihidupkan");
    }
    @Override
    public void matikan_os(){
        System.out.println("PC dimatikan");
    }
    @Override
    public void klik_kanan(){
        System.out.println("PC klik kanan");
    }
    @Override
    public void klik_kiri(){
        System.out.println("PC klik kiri");
    }
    @Override
    public void tekan_enter(){
        System.out.println("PC tekan enter");
    }
    @Override
    public void cetak_data(){
        System.out.println("PC cetak data");
    }
    
}
