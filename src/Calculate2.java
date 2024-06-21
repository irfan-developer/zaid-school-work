import java.util.Scanner;

public class Calculate2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c,s;
        System.out.println("Enter 3 no.s");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        s = Math.sqrt(a*a/Math.pow(b,4)+c*c);
        System.out.println("The final number is ="+s);
    }
}
