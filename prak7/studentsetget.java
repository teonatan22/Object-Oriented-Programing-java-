package pbo.prak7;
class student{
    private int idktm;
    private String namestudent;
    private String gender;
    private String address;

    public student (int idktm, String namestudent, String gender, String address){
        this.idktm= idktm;
        this.namestudent=namestudent;
        this.gender=gender;
        this.address=address;
    }
    public student() {
    }
    public void setidktm(int idktm){
        this.idktm = idktm;
    }
    public void getidktm(){
        return;
    }
    public void setnamestudent(String namestudent){
        this.namestudent=namestudent;
    }
    public String getnamestudent(){
        return namestudent;
    }
    public void setgender (String gender){
        this.gender=gender;
    }
    public String getgender (){
        return gender;
    }
    public void setaddress(String address){
        this.address=address;
    }
    public String getaddress(){
        return address;
    }
    public String getall(){
        return "\nBiodata : \nnim : "+ idktm + "\nname : "+ namestudent +"\ngender : "+ gender+"\naddress : "+address+"\n";
    }
}
public class studentsetget {
    public static void main(String[]args){
    student obj = new student();

    obj.setidktm(20220801);
    obj.setnamestudent("teo");
    obj.setgender("lelaki");
    obj.setaddress("jl,kebon jeruk");
    System.out.println(obj.getall());
    }
}
