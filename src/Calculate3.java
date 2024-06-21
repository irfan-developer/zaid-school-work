import java.util.Scanner;

public class Calculate3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,x,v;
        System.out.println("Enter 4 nos");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        x = sc.nextDouble();
        v = a * Math.pow(x,3)+Math.pow((b*x),2)+ a*b*c + 2*b*c;
        System.out.println("The final number is ="+v);
    }

}
