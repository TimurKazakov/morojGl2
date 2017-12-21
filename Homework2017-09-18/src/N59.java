import sun.nio.cs.ext.MacThai;

import java.util.Scanner;

public class N59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  System.out.println("Задайте l (длину)");
        // double l = sc.nextDouble();
        // если нужна произвольная длина
        double l = 1;
        System.out.println("Задайте Х");
        double x = sc.nextDouble();
        System.out.println("Задайте Y");
        double y = sc.nextDouble();

        double c = x * x + y * y;
        // окружность
        if (c <= (l * l)) {
            System.out.println("Точка принаджежит фигуре а");
        } else System.out.println("Точка не  фигуре а");

        if (x >= l / 2 && y >= l / 2) {
            if (c <= (l * l)) {
                System.out.println("Точка принаджежит  фигуре б");
            }
            System.out.println("Точка не принадлежит фигуре б");
        }

        if ((Math.abs(x) <= l) & (Math.abs(y) <= l)) {
            System.out.println("Точка принаджежит фигуре в");
        } else System.out.println("Точка не принаджежит фигуре в");

        if (Math.abs(x) + Math.abs(y) <= l) {
            System.out.println("Точка принаджежит фигуре г");
        } else System.out.println("Точка не принаджежит фигуре г");

        double l1 = l * 0.75;
        if (Math.abs(x) + Math.abs(y) <= l1) {
            System.out.println("Точка принаджежит фигуре д");
        } else System.out.println("Точка не принаджежит фигуре д");


        if (x >= 0) {
            if (c <= (l * l)) {
                System.out.println("Точка принаджежит фигуре е");
            } else System.out.println("Точка не принадлежит фигуре е");
        } else if (x < 0) {
            if ((Math.abs(x) <= l && Math.abs(y) <= l) || (Math.abs(x) <= 2 * l && Math.abs(y) <= l)) {
                System.out.println("Точка принаджежит фигуре е3");
            }else System.out.println("Точка не принадлежит фигуре е4");
        }


        if (y >= 0){
            if (Math.abs(y)-Math.abs(x) >= l){
                System.out.println("Точка принаджежит фигуре ж");
            } else System.out.println("Точка не принаджежит фигуре ж");
        } else if (y<0) {
            if ((Math.abs(y)* 1.5 >= Math.abs(x)) && (Math.abs(y) <= l)) {
                System.out.println("Точка принаджежит фигуре ж");
            } else System.out.println("Точка не принаджежит фигуре ж");
        }


        if (y>=0){
            if(Math.abs(x)>y ){
                System.out.println("Точка принаджежит фигуре з");
            }else System.out.println("Точка не принаджежит фигуре з");
        } else if( y <0){
            if ( Math.abs(x)<l && Math.abs(y)< l * 2){
                System.out.println("Точка принаджежит фигуре з");
            }else System.out.println("Точка не принаджежит фигуре з");
        }


      /*  if (x <= 0 && y >= 0){
            if ((Math.abs(x)<= l && y <= l) || (Math.abs(x)< 1.5*l && Math.abs(x)-y> l*1.5){
                System.out.println("Точка принаджежит фигуре и");
            }else System.out.println("Точка не принаджежит фигуре и");
        } else if (x<0 && y<0){

        }
        if(x>0 && y>0) System.out.println("Точка не принаджежит фигуре и");
*/

        if (y>= Math.abs(x)){
            System.out.println("Точка принадлежит к");
        } else System.out.println("точка не принадлежит к");




    }
}