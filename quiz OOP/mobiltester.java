package quizPBO;

public class mobiltester {
    public static void main(String[] args) {
        mobil mobil=new mobil("bensin","convensional",4);
        mobil.fuel();
        mobil.startengine();
        mobil.roda();
        mobil.running();
    }
}
