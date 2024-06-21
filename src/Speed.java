import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double u,t,a,s=0.0d;
        System.out.println("Enter value of a:");
        a = sc.nextDouble();
        System.out.println("Enter value of t:");
        t = sc.nextDouble();
        System.out.println("Enter value of u:");
        u = sc.nextDouble();
        s = (u*t) + (0.5)*a*Math.pow(t,2);
        System.out.println("Value of s:"+s);
    }
}
