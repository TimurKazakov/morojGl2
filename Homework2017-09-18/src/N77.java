import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

import static java.lang.Math.cos;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.sin;

public class N77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        int n = sc.nextInt();

        System.out.println("a) "+Math.pow(2,n));
        // скорее всего это модуль
        System.out.println("б) "+ Math.abs(n));

        double pr = 1;
        double x = 0;
        for (int i = 1; i<=n; i++ ){
            x = 1+ 1/Math.pow(i,2);
            pr = x * pr;
        }
        System.out.println("в) "+ pr);

        double sum=0;
        double x2=0;
        double sinus = Math.toRadians(0);
        for(int i=1; i < n; i++ ){
            x2 = 1/sinus+sin(i);
            sinus= sinus + sin(i);
            sum = sum + x2;
        }
        System.out.println("г) "+ sum);

        double x3=Math.sqrt(2);
        double sum2 =0;
        for (int i=1; i <= n; i++ ){
            sum2 = sum2 +x3;
        }
        System.out.println("д) "+sum2);

        double pr2 = 1;
        double sumcos = Math.cos(1);
        double sumsin = Math.sin(1);

        for (int i = 1; i <= n; i++ ){
            pr = sumcos/sumsin * pr;
            sumcos = sumcos + cos(i);
            sumsin = sumsin + sin(i);
        }
        System.out.println("е) "+ pr);

        int n2 = n;
        double x4 = Math.sqrt(3*n);
        for (int i= 0; n2 >= i; n2--) {
            x4 = sqrt(3 * n2 + x4);
        }
        double x5 = sqrt(6+ x4);
        double x6 = sqrt(3+ x5);
        System.out.println("ж) "+ x6);





    }
}