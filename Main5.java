import java.math.BigInteger;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            System.out.println(a.add(b));
        }
    }
}
