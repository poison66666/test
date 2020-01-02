import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            StringBuilder stringBuilder = new StringBuilder();

            for(int i = 0;i<line.length();i++){
                char c = line.charAt(i);
                if(!stringBuilder.toString().contains(c+"")){
                    stringBuilder.append(c);
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
