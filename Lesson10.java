package classwork;
import java.util.Scanner;
import java.util.Random;
public class Lesson10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        /*
-------23.08.2022--------------------------------------------------------------------------------------------------
         */
        //#1
        /*
        int sum = 0;
        int[]a = new int[12];
        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(12)-5;
        }
        for (int i = 0;i<a.length;i++){
            //System.out.print(a[i]+" ");
            sum=sum+a[i];
        }
        System.out.println("\n"+sum);
         */
        /*
-------------------------------------------------------------------------------------------------------------------
         */
        //#2
        /*
        int mult = 1;
        int[]a = new int[13];
        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(21)-12;
        }
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if (a[i]<0)mult = mult * a[i];
        }
        System.out.println("\n"+mult);
         */
        /*
-------------------------------------------------------------------------------------------------------------------
         */
        //#3
        /*
        int quant = 0;
        int[] a = new int[11];
        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(20);
        }
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if (a[i]%3==0||a[i]%5==0||a[i]%7==0)quant++;
        }
        System.out.println("\n"+quant);
         */
        /*
-------------------------------------------------------------------------------------------------------------------
         */
        //#4
        /*
        int sum = 0;
        int[] a = new int[15];
        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(25);
        }
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if (a[i]%2==0)sum=sum+a[i];
        }
        System.out.println("\n"+sum);
         */
        /*
------------------------------------------------------------------------------------------------------------------
         */
        //#4
        int[] a = new int[15];
        fillArray(a);
        showArray(a);
        sumChet(a);
    }
    static void fillArray (int[] a){
        Random gen = new Random();
        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(25);
        }
    }
    static void showArray (int[] a){
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void sumChet (int[] a){
        int sum = 0;
        for (int i = 0;i<a.length;i++){
            if (a[i]%2==0)sum+=a[i];
        }
        System.out.println("\n"+sum);
    }
}
