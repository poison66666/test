import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        //count < 300000相当于对8*x+7进行操作，相当于3个2*x+1
        while (x != 0 && count < 300000){
            x = ((x << 1)+1) % 1000000007;
            count++;
        }
        count = (count+2)/3;//两个8*x+7相当于三个4*x+3
        //所以4*x+3只能有两次，三次就转化为了8*x+3
        System.out.println(count < 100000 ? count:-1);
    }
}
