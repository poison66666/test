import java.util.Scanner;

public class Main22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];//n个整数
        //A1-A5功能
//flag : A2功能中用到的错误+-
//count: A4中计数
        int A1=0,A2=0,A3=0,A4=0,A5=0,flag = 1,count = 0;
        for(int i = 0;i < N;i++){
            num[i] =sc.nextInt();
            //A1
            if(num[i] %5 == 0){
                if(num[i] %2 == 0){
                    A1 += num[i];
                }
            }
            //A2
            if(num[i] %5 == 1){
                A2 +=flag*num[i];
                flag = -flag;
            }
            //A3
            if(num[i] %5 == 2){
                A3++;
            }
            //A4
            if(num[i] %5 == 3){
                A4 += num[i];
                count++;
            }
            //A5
            if(num[i] %5 == 4){
                if(num[i] > A5){
                    A5 = num[i];
                }
            }

            if(A1 != 0){
                System.out.println(A1 + " ");
            }else{
                System.out.println("N" + " ");
            }

            if(A2 != 0){
                System.out.println(A2 + " ");
            }else{
                System.out.println("N" + " ");
            }

            if(A3 != 0){
                System.out.println(A3 + " ");
            }else{
                System.out.println("N" + " ");
            }

            if(A4 != 0){
                System.out.println(A4/count + "." + (int)((A4%count*100/count+5)/10)+" ");
            }else{
                System.out.println("N" + " ");
            }

            if(A5 != 0) {
                System.out.println(A5 + " " );
            }else{
                System.out.println("N" + " ");
            }
        }

    }
}


/*
import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[5];//存储打印出来的内容
        int[] count = new int[5];//满足分类的计数值
        int status = 0; //用于切换加减数值
        for(int i = 0;i <N;i++) {
            long nums = sc.nextLong();
            switch ((int) (nums % 5)) {
                case 0:
                    if (nums % 2 == 0) {
                        arr[0] += nums;
                        count[0]++;
                    }
                    break;
                case 1:
                    if (status % 2 == 0) {
                        arr[1] += nums;
                        status = 1;
                    } else {
                        arr[1] -= nums;
                        status = 0;
                    }
                    count[1]++;
                    break;
                case 2:
                    arr[2]++;
                    count[2]++;
                    break;
                case 3:
                    count[3]++;
                    arr[3] += nums;
                    break;
                case 4:
                    count[4]++;
                    if (nums > arr[4]) {
                        arr[4] = nums;
                    }
                default:
                    break;

            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0;i<5;i++){
            if(count[i] != 0){
                if(i != 3){
                    stringBuffer.append(arr[i]).append(" ");
                }else{
                    stringBuffer.append(Float.valueOf(String.format("%.1f",(arr[3]/(float)count[3])))).append(" ");
                }
            }else{
                stringBuffer.append("N").append(" ");
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length()-1);
        System.out.println(stringBuffer);
    }
}
*/
