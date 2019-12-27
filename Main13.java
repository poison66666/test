
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x0 = sc.nextLong();
        long m = 1000000007;//取模的值
        long s = 100000;//神秘力量的次数

        long[] begin = new long[3]; //4x+3执行三次

        //三次取值
        begin[0] = x0;
        begin[1] = (4*begin[0] + 3)%m;
        begin[2] = (4*begin[1] + 3)%m;

        long minStep = s; //当前最短步数
        long cur = 0;
        int step = 0;//执行步数
        for(int i = 0; i < 3;i++){
            cur = begin[i];
            step = i;
            while (cur != 0 && step < minStep){
                cur = (8 * cur + 7) % m; //8x+7执行
                step++;
            }
            minStep = minStep < step ? minStep:step;
        }
        if(minStep < s){
            System.out.println(minStep);
        }else{
            System.out.println(-1);
        }
    }
}
