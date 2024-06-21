import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
double a,b,swap=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no.");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Before swapping a ="+a+" and b ="+b);
        swap = a;
        a=b;
        b=swap;
        System.out.println("After swapping a ="+a+" and b ="+b);
    }
}
