package quizPBO;

public class mobil extends vehicle {
    public int roda;
    
    public mobil(String bahanbakar, String engine, int roda){
        super(bahanbakar, engine);
        this.roda=roda;
    }
    public void running(){
        System.out.println("mobil sedang berjalan");
    }
    public void roda(){
        System.out.println("jumlah roda : "+roda);
    }
}
