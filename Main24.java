import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        while (sc.hasNext()){
            n = sc.nextInt(); //学生数量
            m = sc.nextInt(); //老师可以操作的次数
            int[] stu = new int[n]; //学生成绩
            for(int i = 0;i<n;i++){
                stu[i] = sc.nextInt();
            }
            //老师询问
            for(int i = 0;i<m;i++){
                String c = sc.next();
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(c.equals("Q")){
                    int s = Math.min(a,b); //开始下标
                    int e = Math.max(a,b); //结束下标
                    int max = stu[s-1];
                    for(int index = s;index < e;index++){
                        max = Math.max(max,stu[index]);
                    }
                    System.out.println(max);
                }
                if(c.equals("U")){
                    stu[a-1] = b;
                }
            }
        }
    }
}










/*
import java.util.Scanner;

public class Main24 {
    public static void opreator(int[] arr,char c,int A,int B){
        int max = 0;
        int begin = (A < B ? A : B)-1;
        int end = A > B ? A: B;
        if(c == 'Q'){
            for(int j = begin;j < end;j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            System.out.println(max);
        }else if(c == 'U'){
            arr[A-1] = B;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            //输入两个正整数
            int N = sc.nextInt();  //学生数目
            int M = sc.nextInt();  //操作数目
            int[] arr = new int[N];
            //初始成绩
            for(int i = 0;i<N;i++){
                arr[i] = sc.nextInt();
            }

            //询问和更新操作
            for(int i = 0;i < M;i++){
                char c = sc.next().toCharArray()[0];
                int A = sc.nextInt();
                int B = sc.nextInt();
                opreator(arr,c,A,B);
            }
        }
    }
}*/
