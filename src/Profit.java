import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cp,sp,p=0,pp=0;
        System.out.println("Enter Cost Price");
        cp = sc.nextDouble();
        System.out.println("Enter Selling Price");
        sp = sc.nextDouble();
        p = cp-sp;
        pp = (p/cp)*100;
        System.out.println("The profit is:"+p);
        System.out.println("The Profit Percentage is:"+pp);
    }
}
