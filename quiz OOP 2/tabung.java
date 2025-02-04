package quizPBO2;

public class tabung extends bangunruang {
    float x,r,t;
    public tabung(String nama, float x, float r, float t){
        super(nama);
        this.x=x;
        this.r=r;
        this.t=t;
    }

    public void voltabung(){
        hasil=x*r*r*t;
    }
    public void keltabung(){
        hasil=2*x*r+2*x*r;
    }
}
