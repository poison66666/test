/*
import java.util.Scanner;
import java.util.Stack;

public class Main6 {

    */
/*public static int[] op_stack(int[] arr){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int half = arr.length/2;
        for(int i = 0;i <half;i++){
            s1.push(arr[i]);
        }
        for(int i = half;i <arr.length;i++){
            s2.push(arr[i]);
        }
        int i = arr.length-1;
        while (!s1.isEmpty()){
            arr[i--] = s2.pop();
            arr[i--] = s1.pop();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m > 0){
            int n =sc.nextInt();
            int k = sc.nextInt();
            n<<=1;
            int[] arr = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < k;i++){
                arr = op_stack(arr);
            }
            for(int i = 0;i < n-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println(arr[n-1]);
            m--;
        }
    }*//*


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            n <<= 1;
            int[] arr = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < k;i++){
                arr = op_stack(arr);
            }
            for(int i = 0; i < n - 1;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[n-1]);
            T--;
        }

    }

    private static int[] op_stack(int[] arr) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int half = arr.length/2;
        for(int i = 0; i<half;i++){
            s1.push(arr[i]);
        }
        for(int i = half;i < arr.length;i++){
            s2.push(arr[i]);
        }
        int i = arr.length-1;
        while (!s1.isEmpty()){
            arr[i--] = s2.pop();
            arr[i--] = s1.pop();
        }
        return arr;
    }
}
*/

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = sc.nextInt();//组数
        while (groups > 0) {
            int n = sc.nextInt(); //数字个数的一半
            int k = sc.nextInt(); //洗牌次数
            int[] res = new int[2*n]; //数据总个数
            for(int i = 0;i<2*n;i++){
                int tmp = i+1;
                for(int j = 0;j <k;j++){
                    if(tmp <= n){
                        tmp = 2*tmp+1;
                    }else{
                        tmp = 2*(tmp-n);
                    }
                }
                res[tmp-1] = sc.nextInt();
            }

            if(res.length > 0){
                System.out.println(res[0]);
            }

            for(int i = 1;i <2 * n;i++){
                System.out.println(" "+res[i]);
            }
            System.out.println();
        }
    }
}