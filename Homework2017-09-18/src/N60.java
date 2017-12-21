import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

import static java.lang.StrictMath.E;
import static java.lang.StrictMath.sqrt;


public class N60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте Х");
        double x = sc.nextDouble();
        System.out.println("Задайте Y");
        double y = sc.nextDouble();
        double u;
        double okr = x*x + y*y;
        // a)

        if (okr >=1 && okr <=2 ){
            u = 0;
        } else u = x;
        System.out.println("а) " +u);

        // b)

        if (okr <=1 ){
            if (x / 2 >= y) u = -3;
        } else u = y*y;
        System.out.println("б) "+u);

        // в)
        if ( 1-x*x >=0 && 1-x*x <=1){
            double X =sqrt(1-x*x)+1;
            if ( X <= 2){
                u = x-y;
            }

        } else u = x*y + 7;
        System.out.println("в) "+ u);


        // г)

        if (okr <=1 && y>= 0) {
            if (okr >= 0.3 && x <= 0 && x >= 0.3) {
                u = x * x - 1;
            }
        }else u = sqrt(x-1);
        System.out.println("г) " + u);

        // д)
        if (y>= Math.abs(x) && okr >= 0.5 && okr <= 1){
            u=sqrt(x*x-1);
        }else u = x+y;
        System.out.println("д) " + u);

        // е)
        if (y>=x*x && y<=1){
            if (y>= Math.pow(E,x)){
            u = x+y;
            }
        } else u =x-y;
        System.out.println("е) "+u);
    }


}


