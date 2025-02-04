package quizPBO;

public class pesawat extends vehicle {
    int sayap;
    public pesawat (String bahanbakar, String engine, int sayap){
        super(bahanbakar, engine);
        this.sayap=sayap;
    }
    public void landing(){
        System.out.println("pesawat sedang mendarat");
    }
    public void sayap(){
        System.out.println("jumlah sayap : "+sayap);
    }
}
