import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int ability = 0;
        while (sc.hasNext()){
            num = sc.nextInt();//怪物的数量
            ability = sc.nextInt();//小易初始能力值
            for(int i = 0 ;i < num;i++){
                int monster = sc.nextInt();
                if(monster < ability) {
                    ability += monster;
                }else{
                    ability += GDC(ability,monster);
                }
            }
            System.out.println(ability);
        }
        sc.close();
    }
//辗转相除法求最大公因数
    private static int GDC(int a, int b) {
        int temp = 0;
        while (b > 0){
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


/*
import java.util.Scanner;

public class Main23 {
    //最大公约数
    public static int fun(int a,int b){
        int num = 1;
        for(int i = 1; i <= a && i <= b ;i++){
            if(a % i==0 && b % i == 0){
                num = i;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();//怪物数量
            int a = sc.nextInt();//小易初始能量值
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();//怪物防御力
            }
            for(int i = 0;i<arr.length;i++){
                if(arr[i] < a){
                    a += arr[i];
                }else{
                    a += fun(a,arr[i]);
                }
            }
            System.out.println(a);
        }
    }
}
*/
