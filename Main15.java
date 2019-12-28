public class Main15 {
    public static void main(String[] args) {
        long sumRich = 0;
        long sumStranger = 0;
        for(int i = 1;i <= 30;i++){
            sumRich += 10;
            sumStranger = sumStranger + (long)Math.pow(2,i-1);
        }
        System.out.println(sumRich + " "+ sumStranger);
    }
}












/*
public class Main15 {
    public static void main(String[] args) {
        int[] million = new int[30];
        int[] person = new int[30];
        for(int i = 0;i<30;i++){
            person[i] = 10;
            million[i] = (int)Math.pow(2,i);
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i < 30;i++){
            sum1 += million[i];
            sum2 += person[i];
        }
        System.out.println(sum2 + " "+sum1);
    }
}
//import java.util.*;
//public class Main15 {
//    public static void main(String[] args) {
//        //strange是陌生人，rich是有钱人，strange每天给rich 10万元，rich第一天给2分，第二天给4分
//        int strange = 0;
//        int rich = 0 ;
//        strange = 10*30; //万元
//        rich =(int)( Math.pow(2,30) - 1);
//        System.out.print(strange + " " + rich);
//    }
//}*/
