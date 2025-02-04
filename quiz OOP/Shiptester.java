package quizPBO;

public class Shiptester {
    public static void main(String[] args) {
        Ship Ship=new Ship("solar", "diesel", 2);
        Ship.fuel();
        Ship.startengine();
        Ship.sailing();
        Ship.anchor();
    }
}
