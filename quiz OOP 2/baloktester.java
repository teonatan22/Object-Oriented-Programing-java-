package quizPBO2;

public class baloktester {
    public static void main(String[] args) {
        balok kelilingbalok=new balok("balok",4,5,7);
        kelilingbalok.kelbalok();
        kelilingbalok.keliling();
    
        volumebalok volumebalok = new volumebalok("balok",4,5,7);
        volumebalok.volbalok();
        volumebalok.volume();
    }
}
