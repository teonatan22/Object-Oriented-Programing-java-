package pbo.tugaslatihan;
public class OperasiBilanganCetak extends OperasiBilangan {
   public OperasiBilanganCetak() {
   }

   public void cetakSemua(OperasiBilangan[] ob, double a, double b) {
      for(int i = 0; i < ob.length; ++i) {
         ob[i].setA(10.5);
         ob[i].setB(0.5);
         ob[i].setC();
         ob[i].tampil();
      }

      ob = null;
   }

   public static void main(String[] args) {
      OperasiBilangan[] ob = new OperasiBilangan[]{new OperasiPenjumlahan(), new Operasipengurangan(), new OperasiPembagian(), new OperasiPerkalian()};
      OperasiBilanganCetak abc = new OperasiBilanganCetak();
      abc.cetakSemua(ob, 10.5, 0.5);
   }
}