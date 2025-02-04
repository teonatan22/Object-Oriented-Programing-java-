package quizPBO2;

public class balok extends bangunruang {
    float l,p,t;
    public balok (String nama, float l, float p, float t){
        super(nama);
        this.l=l;
        this.p=p;
        this.t=t;
    }
    public void kelbalok(){
        hasil=4*(l+p+t);
    } 
    public void volbalok(){
        hasil=l*p*t;
    }  
}
