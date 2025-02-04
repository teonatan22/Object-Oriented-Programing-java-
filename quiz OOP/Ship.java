package quizPBO;

public class Ship extends vehicle {
    int anchor;
    public Ship (String bahanbakar, String engine,int anchor){
        super(bahanbakar, engine);
        this.anchor=anchor;
    }
    public void sailing(){
        System.out.println("kapal sedang berlayar");
    }
    public void anchor(){
        System.out.println("jumlah anchor : "+anchor);
    }
}
