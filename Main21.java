import java.util.*;
public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] c = sc.next().toCharArray();
            Set<Character> set = new HashSet<>();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < c.length; i++) {
                if (set.add(c[i])) {
                    sb.append(c[i]);
                }
            }
            System.out.println(sb.toString());
        }
        /*char[] chars = s.toCharArray();
        ArrayList<Character> arrayList1 = new ArrayList<>();
        ArrayList<Character> arrayList = new ArrayList<>();
        for(int i = 0;i<chars.length;i++){
            arrayList.add(chars[i]);
        }
        for(Character a : arrayList){
            if(!arrayList1.contains(a)){
                arrayList1.add(a);
            }
        }
        for(int i = 0;i<arrayList1.size();i++){
            chars[i] = arrayList1.get(i);
        }

        System.out.println(chars.toString());*/
    }
}