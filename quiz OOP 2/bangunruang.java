package quizPBO2;

public class bangunruang {
    String nama;
    float hasil;
    public bangunruang(String nama){
        this.nama=nama;
        this.hasil=hasil;
    }
    public void volume(){
        System.out.println("volume bangun ruang "+nama+" : " +hasil);
    }

    public void keliling (){
        System.out.println("keliling bangun ruang "+nama+" : "+hasil);
    }
}
