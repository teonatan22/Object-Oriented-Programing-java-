package quizPBO;

public class vehicle {
    String bahanbakar;
    String engine;

    public vehicle(String bahanbakar, String engine){
        this.bahanbakar=bahanbakar;
        this.engine=engine;
    }
    public void fuel (){
        System.out.println("bahan bakar : "+bahanbakar);
    }
    
    public void startengine (){
        System.out.println("mesin dinyalakan ");
    }
}
