import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1 {
    public String GetSequeOddNum(int m){
        int num=(int)Math.pow((double)m,3.0);
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;

        StringBuilder result=new StringBuilder();
        //前半部分拼接
        int i = 0;
       for(i= 1;i <1000000;i+=2){
           queue.offer(i);
           if(queue.size() >m){
               sum -= queue.poll();
           }
           sum+=i;
           if(sum == num){
               break;
           }
       }
       if(i <1000000){
           while (!queue.isEmpty()){
               result.append(queue.poll());
               if(!queue.isEmpty()){
                   result.append("+");
               }
           }
       }
       return result.toString();

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Main1 main = new Main1();
        while (sc.hasNextInt()){
            int pop = sc.nextInt();
            String str = main.GetSequeOddNum(pop);
            System.out.println(str);
        }
    }

    public String GetSequeOddNum1(int m) {
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sc = new StringBuilder();
        int sum = 0;
        int num = (int)Math.pow(m,3);
        int i = 0;
        for(i = 1;i <1000000;i+=2){
            queue.offer(i);
            if(queue.size() > m){
                sum -= queue.poll();
            }
            sum += i;
            if(sum == num){
                break;
            }
        }
        if(i < 1000000){
            while (!queue.isEmpty()){
                sc.append(queue.poll());
                if(!queue.isEmpty()){
                    sc.append("+");
                }
            }
        }
        return sc.toString();
    }
}