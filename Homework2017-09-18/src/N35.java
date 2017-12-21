/* я понял задание так: найти максимум между суммой и произведением
и минимум между квадратами суммы и произведения
 */

import java.util.Scanner;

public class N35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Х");
        int x = sc.nextInt();
        System.out.println("Введите Y");
        int y = sc.nextInt();
        System.out.println("Введите Z");
        int z = sc.nextInt();
        int maxSum = x + y + z;
        int maxPr = x * y * z;
        double minSum =  Math.pow(x + y + z / 2,2)+1;
        double minPr = Math.pow(x * y * z,2)+1;

        if (maxSum > maxPr) {
            System.out.println(" Сумма введенных чисел больше из произведения");
        } else if (maxSum < maxPr) {
            System.out.println("Произведение введенных чисел больше их суммы");
        } else System.out.println("Сумма и произведение равны");

        if (minSum < minPr) {
            System.out.println("Квадрат суммы введенных чисел меньше квадрата их произведения");
        } else if (maxSum > maxPr) {
            System.out.println("Квадрат произведения введенных чисел меньше их суммы");
        } else System.out.println("Квадрат произведения и суммы равны");

    }
}