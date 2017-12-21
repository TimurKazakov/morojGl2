import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class N78 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввежите а");
        double a = sc.nextDouble();
        System.out.println("Введите n");
        int n = sc.nextInt();

       // а)
        System.out.println("a) "+ Math.pow(a,n));

        // б)
        double pr = a;
        for (int i = 1; i < n; i++){
            pr = pr * (a+i);
        }
        System.out.println("б) " + pr);


        // в)
        double pr1=0, sum1=1/a;
        for (int i = 1; i <= n; i++){
            pr1 = pr * (a+i);
            sum1 = sum1 + 1/pr;
        }
        System.out.println("в) " +sum1);

        // г)
        double  sum2 = 1/a;
        double st = 1/ Math.pow(a,Math.pow(2,1));
        for (int i=2; i<= n; i++){
            sum2 = sum2 + st;
            st = 1/ Math.pow(a,Math.pow(2,i));
        }
        System.out.println("г) "+ sum2);

        //д)
        double pr2 = a*a - a*n;

        for (int i = 2; i<=n; i++){
            pr2 = pr2 * (a- i*n);
        }
        System.out.println("д) "+ pr2);
    }
}