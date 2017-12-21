import java.util.ArrayList;
import java.util.Scanner;

public class N88 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Ведите число");
        int n = sc.nextInt();
        int ost;
        int scet = 0;
        ArrayList<Integer> array = new ArrayList<>();
        while (n>0){
            ost = n % 10;
            array.add(0,ost);
            n = n/10;
            if (ost == 3) {
                scet ++;
            }
        }
        System.out.println();
        ArrayList<Integer> array2 = new ArrayList<>(array);
                for (int i=0; i < array.size(); i ++){
            System.out.print(array.get(i));
        }

        if (scet > 0) System.out.println("Число содержит 3");

        for (int i = 0; i < array.size(); i ++){
            int j = array.size() - i - 1;
            System.out.print(array.get(j));
        }
        System.out.println();

        array.add(array.get(0));
        int switcher = array.get(array.size()-2);
        array.remove(array.size()-2);
        array.add(0,switcher);
        array.remove(1);
        for (int i=0; i < array.size(); i ++){
            System.out.print(array.get(i));
        }
        System.out.println();
        array2.add(1);
        array2.add(0,1);
        for (int i=0; i < array2.size(); i ++){
            System.out.print(array2.get(i));
        }
    }
}
