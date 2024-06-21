import java.util.Scanner;

public class Pendulum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l,g,t;
        System.out.println("Enter the effective length of the pendulum");
        l = sc.nextDouble();
        System.out.println("Enter acceleration due to gravity");
        g = sc.nextDouble();
        t = 2 * 3.14 * Math.sqrt(l/g);
        System.out.println("The time period is ="+t);
    }
}
