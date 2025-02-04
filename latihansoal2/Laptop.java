package pbo.latihansoal2;

public class Laptop extends Komputer {
    @Override
    public void hidupkan_os(){
        System.out.println("Laptop dihidupkan");
    }
    @Override
    public void matikan_os(){
        System.out.println("Laptop dimatikan");
    }
    @Override
    public void klik_kanan(){
        System.out.println("Laptop klik kanan");
    }
    @Override
    public void klik_kiri(){
        System.out.println("Laptop klik kiri");
    }
    @Override
    public void tekan_enter(){
        System.out.println("Laptop tekan enter");
    }
    @Override
    public void cetak_data(){
        System.out.println("Laptop cetak data");
    }
}
