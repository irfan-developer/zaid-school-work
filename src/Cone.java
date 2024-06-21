import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,v,h;
        System.out.println("Enter the radius of the cone:");
        r = sc.nextDouble();
        System.out.println("Enter the height of the cone:");
        h = sc.nextDouble();
        v = (0.33)*(3.14)*Math.pow(r,2)*h;
        System.out.println("The volume of the cone is:"+v);
    }
}
