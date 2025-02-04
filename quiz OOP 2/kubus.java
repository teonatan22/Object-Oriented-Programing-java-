package quizPBO2;

public class kubus extends bangunruang {
    float sisi;
    public kubus (String nama,float sisi){
        super(nama);
        this.sisi=sisi;
    }

    public void kelkubus(){
        hasil=sisi*16;
    }
    public void volkubus(){
        hasil=sisi*sisi*sisi;
    }    
}
