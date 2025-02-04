package pbo.prak7;
class nilai{
    private double quis;
    private double UTS;
    private double UAS;

    public void setquis (double x){
        if (x>= 0 && x<=100)
            quis = x;
    }
    public void setUTS (double x){
        if (x>=0 && x<=100)
            UTS = x;
    }
    public void setUAS (double x){
        if (x>=0 && x<=100)
            UAS = x;
    }
    public double getquis(){
        return quis;
    }
    public double getUTS(){
        return UTS;
    }
    public double getUAS(){
        return UAS;
    }
    public double getNA(){
        return 0.20*quis + 0.30*UTS + 0.50*UAS;
    }
}
