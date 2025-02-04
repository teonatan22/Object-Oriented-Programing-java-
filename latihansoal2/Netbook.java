package pbo.latihansoal2;

public class Netbook extends Komputer {
    @Override
    public void hidupkan_os(){
        System.out.println("Netbook dihidupkan");
    }
    @Override
    public void matikan_os(){
        System.out.println("Netbook dimatikan");
    }
    @Override
    public void klik_kanan(){
        System.out.println("Netbook klik kanan");
    }
    @Override
    public void klik_kiri(){
        System.out.println("Netbook klik kiri");
    }
    @Override
    public void tekan_enter(){
        System.out.println("Netbook tekan enter");
    }
    @Override
    public void cetak_data(){
        System.out.println("Netbook cetak data");
    }
}
