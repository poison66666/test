import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for(int i = 0; i < 10;i++){
            num[i] = sc.nextInt();
        }
        //第一次输出不是0的数
        for(int i = 1; i < 10;i++){
            if(num[i] != 0){
                System.out.print(i);
                num[i]--;
                break;
            }
        }
        //输出0
        while (num[0] != 0){
            System.out.print(0);
            num[0]--;
        }
        //输出剩余数
        for(int i = 1; i < 10;i++){
            while (num[i] != 0) {
                System.out.print(i);
                num[i]--;
            }
        }
    }
}
