
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        String c = sc.next();
        //第一行输出
        for(int i = 1;i <= N;i++ ) {
            System.out.print(c);
        }
        System.out.println();
        //中间输出
        for(int i = 1;i<=Math.ceil((double)N/2)-2;i++){
            System.out.print(c);//第一列
            for(int j = 2; j <= N-1;j++){
                System.out.print(" ");//中间列输出空格
            }
            System.out.println(c);//最后一列
        }
        //最后一行输出
        for(int i = 1;i<=N;i++){
            System.out.print(c);
        }
    }
}
