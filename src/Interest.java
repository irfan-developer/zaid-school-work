import java.util.Scanner;

public class Interest {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double p,r,t,a,ci,si;
        System.out.println("Enter Principal");
        p = sc.nextDouble();
        System.out.println("Enter Rate");
        r = sc.nextDouble();
        System.out.println("Enter Time");
        t = sc.nextDouble();
        si = p*r*t/100;
        a = p*Math.pow((1 + r/100),t);
        ci = a - p;
        double diff = ci - si;
        System.out.println("The Amount is " +a);
        System.out.println("The Simple Interest is "+si);
        System.out.println("The Compound Interest is "+ci);
        System.out.println("The Difference is "+diff);
    }
}
