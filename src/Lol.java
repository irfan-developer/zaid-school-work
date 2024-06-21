import java.util.Scanner;

public class Lol {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c,d,e,f;
        System.out.println("Enter 5 nos");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = Math.pow(a,b)*Math.pow(b,c)*Math.pow(c,d)*Math.pow(d,e);
        System.out.println("The final number is "+f);
    }
}
