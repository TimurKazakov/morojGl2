import java.util.Scanner;

public class N31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число (а)");
        int A = sc.nextInt();

        int a2 = A*A;
        int a4 = a2*a2; // 2 операции
        System.out.println("a) а в степени 4 = " + a4);

        a2 = A * A;
        a4 = a2 * a2;
        int a6 = a4 * a2;
        System.out.println("б) а в степени 6 = " + a6);

        a2 = A * A;
        a4 = a2 * a2;
        a6 = a4 * a2;
        int a7 = a6 * A;
        System.out.println("в) а в степени 7 = " + a7);

        a2 = A * A;
        a4 = a2 * a2;
        int a8 = a4 * a4;
        System.out.println("г) а в степени 8 = " + a8);

        a2 = A * A;
        a4 = a2 * a2;
        a8 = a4 * a4;
        int a9 =a4 * A ;
        System.out.println("д) а в степени 9 = " + a9);


        a2 = A * A;
        a4 = a2 * a2;
        a8 = a4 * a4;
        int a10 = a8 * a2;
        System.out.println("е) а в степени 10 = " + a10);

        a2 = A * A;
        a4 = a2 * a2;
        a8 = a4 * a4;
        int a12 = a8 * a4;
        int a13 = a12 * A;
        System.out.println("ж) а в степени 13 = " + a13);

        a2 = A * A;
        int a3 = a2 * A;
        a6 = a3 * a3;
        a12 = a6 * a6;
        int a15 = a12 * a3;
        System.out.println("з) а в степени 15 = " + a15);

        a2 = A * A;
        a4 = a2 * a2;
        a8 = a4 * a4;
        int a16 = a8 * a8;
        int a20 = a16 * a4;
        int a21 = a20 * A;
        System.out.println("и) а в степени 21 = " + a21);

        a2 = A * A;
        a3 = a2 * A;
        a6 = a3 * a3;
        a7 = a6 * A;
        int a14 = a7 * a7;
        int a28 = a14 * a14;
        System.out.println("к) а в степени 28 = "+ a28);

        a2 = A * A;
        a4 = a2 * a2;
        a8 = a4 * a4;
        a16 = a4 * a4;
        int a32= a16 * a16;
        int a64 = a32 * a32;
        System.out.println("л) а в степени 64 = "+ a64);






    }
}