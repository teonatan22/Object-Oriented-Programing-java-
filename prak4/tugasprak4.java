import java.util.Scanner;
public class tugasprak4 {
    public static void main(String[]args){
        char x;
        Scanner scan= new Scanner(System.in);
        System.out.print("Masukan angka [a-z]/[A-z]/[0-9]");
        x=scan.next().charAt(0);

        if(Character.isLetter(x)){
            System.out.println(x+"adalah huruf");
        }else if(Character.isDigit(x)){
            System.out.println(x+ "adalah angka");
        }
    }
    
}
