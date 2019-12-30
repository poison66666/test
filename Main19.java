import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String value = sc.nextLine();
            char[] chars = value.toCharArray();
            for(int i = 0;i<chars.length;i++) {
                char c = chars[i];
                if('A' <= c){
                    c = (char)('E' < c ? ( c-5 ):( c + 21));
                    chars[i] = c;
                }
            }
            System.out.println(new String(chars));
        }
        /*Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String n = sc.nextLine();
            char[] c = n.toCharArray();
            for (int i = 0;i<c.length;i++){
                if(String.valueOf(c[i]).equals(" ")){
                    continue;
                }
                if(c[i] > 69){
                    c[i] -= 5;
                }else{
                    c[i] += 21;
                }
            }
            System.out.println(c);
        }*/
    }
}
