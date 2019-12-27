import java.util.Scanner;

public class Main14 {
    //返回一个字符串的GC比例
    public static double GiveRatio(String str) {
        double radio = 0;
        double count = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'G' || ch == 'C'){
                count++;
            }
        }
        radio = count/(double)str.length();
        return radio;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); //输入字符串
        int size = sc.nextInt(); //输入字串长度
        String maxStr = ""; //记录比例最高的字符串
        double maxRadio = 0; //记录目前最高的比例
        for(int i = 0; i< s.length()-size+1;i++){
            String str = s.substring(i,i+size);
            if(GiveRatio(str) > maxRadio){
                maxStr = str;
                maxRadio = GiveRatio(str);
            }
        }
        System.out.println(maxStr);
    }
}


/*
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = sc.nextInt();
        int s = str.length();
        int[] count = new int[s-len];//只用遍历到倒数第len个就行，因为后面就没有元素了
        int max = 0;//记录子串的起始下标
        for(int i = 0; i < s-len;i++){
            String subStr = str.substring(i,i+len);
            for(int j = 0;j<len;j++){
                if(subStr.charAt(j) == 'C' || subStr.charAt(j) == 'G'){
                    count[i]++;
                }
            }
            if(count[max] < count[i]){
                max = i;
            }
        }
        String res = str.substring(max,max+len);
        System.out.println(res);
    }
}
*//*


import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = sc.nextInt();
        int s = str.length();
        int[] count = new int[s-len];
        int max = 0;

        for(int i = 0;i<s-len;i++){
            String subStr = str.substring(i,i+len);
            for(int j = 0;j<len;j++){
                if(subStr.charAt(j) == 'C' || subStr.charAt(j) == 'G'){
                    count[i]++;
                }
            }
            if(count[max] < count[i]){
                max = i;
            }
        }

        String res = str.substring(max,max+len);
        System.out.println(res);
    }
}*/
