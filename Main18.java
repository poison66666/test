/*
import java.util.Scanner;
//相当于斐波那契数列
public class Main18 {
    public static void getResult(int n){
        System.out.println(rabbit(n));
    }
    public static int rabbit(int n){
        //如果为1，2月，只有一只，
        if(n == 1 || n == 2){
            return 1;
        }
        return rabbit(n-1)+rabbit(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            getResult(n);
        }
        sc.close();
    }
}
*/

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(rabbit(n));
        }
        sc.close();
    }

    private static int rabbit(int n) {
        if(n <= 2){
            return 1;
        }else{
            return rabbit(n-1) + rabbit(n-2);
        }
    }
}