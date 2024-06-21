import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f,c;
        System.out.println("Enter the temperature in degree F");
        f = sc.nextDouble();
        c = 5*((f-32)/9);
        System.out.println("The temperature in degree C is:"+c);
    }
}
