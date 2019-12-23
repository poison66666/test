import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {
    public static void main(String[] args) throws IOException {
        //缓冲读写器
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = bf.readLine()) != null){
            long m = Integer.valueOf(s);
            long a = m*(m-1) + 1;
            System.out.print(a);//输出首项
            for(int i = 1;i < m;i++){
                System.out.print("+" + (a+2));
            }
            System.out.println();
        }
        bf.close();
    }
}
