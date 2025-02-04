package pbo.prak7;
class box{
    double width,height,depth;
    //cons box
    box (double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
    box(){
        width=height=depth=0;
    }
    box(double len){
        width=height=depth=0;
    }

    double volume(){
        return width*height*depth;
    }
}
public class calculatorpbo {
    public static void main(String[] args) {
        box mybox1 = new box(10,10,10);
        box mybox2 = new box(20,20,20);
        box mybox3 = new box(30,30,30);
        box mybox4 = new box(40,40,40);
        
        double vol1,vol2,vol3,vol4;

        vol1=mybox1.volume();
        vol2=mybox2.volume();
        vol3=mybox3.volume();
        vol4=mybox4.volume();
        System.out.println("volume of mybox1 : \t"+vol1);
        System.out.println("volume of mybox2 : \t"+vol2);
        System.out.println("volume of mybox3 : \t"+vol3);
        System.out.println("volume of mybox4 : \t"+vol4);
    }
}
