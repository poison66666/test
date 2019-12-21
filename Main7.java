/*
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            int score = sc.nextInt();
            int a = map.getOrDefault(score,0);
            map.put(score,a+1);
        }
        int newScore = sc.nextInt();
        if(map.containsKey(newScore)){
            System.out.println(map.get(newScore));
        }else{
            System.out.println(0);
        }
    }
}
*/

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            if(N == 0){
                return;
            }
            int[] arr = new int[N];
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int t = sc.nextInt();
            int count = 0;
            for(int i = 0;i<arr.length;i++){
                if(t == arr[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}