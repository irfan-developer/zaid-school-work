import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double l,b,a=0,p=0,d=0;
        System.out.println("Enter Length");
        l = sc.nextDouble();
        System.out.println("Enter Breadth");
        b = sc.nextDouble();
        a = l*b;
        p = 2*(l+b);
        d = Math.sqrt(l*l + b*b);
        System.out.println("The Area is:"+a);
        System.out.println("The Perimeter is:"+p);
        System.out.println("The Diagonal is:"+d);
        sc.close();
    }
}
