package pbo.latihansoal2;

import javax.sound.midi.Patch;

public final class KomputerCetak {
    private final void cetak(Komputer[]obj){
        for (int i=0;i<obj.length;i++){
            obj[i].hidupkan_os();
            obj[i].klik_kanan();
            obj[i].klik_kiri();
            obj[i].tekan_enter();
            obj[i].cetak_data();
            obj[i].matikan_os();
            System.out.println("##############\n");
        }
    }
    public static void main(String[] args){
        Komputer[] ob={
            new PC(),
            new Laptop(),
            new Netbook()
        };
        KomputerCetak komputerCetak = new KomputerCetak();
        komputerCetak.cetak(ob);
    }
}
