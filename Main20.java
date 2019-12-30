/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String boss = sc.next();
        String person = sc.next();
        LinkedList<Character> list = new LinkedList<>();
        //StringBuilder stringBuilder = new StringBuilder(boss);
        //char[] chars = person.toCharArray();
      */
/* if(boss.contains(person)){
           int len = boss.length() - person.length();
           System.out.println("Yes" + " "+ len);
       }else{
           for(int i = 0;i<chars.length;i++){
               if(boss.charAt(i)==chars[i]){

               }
           }
       }*//*


      for(int i = 0;i < boss.length();i++){
          char ch = boss.charAt(i);
          list.add(ch);
      }
      int count = 0;
      for(int i = 0;i<person.length();i++){
          char ch = person.charAt(i);
          for(int j = 0;j <list.size();j++){
              if (ch == list.get(j)) {
                  list.remove(j);
                  count++;
                  break;
              }
          }
      }
      if(count == person.length()){
          System.out.println("Yes" + " "+(boss.length()-count));
      }else{
          System.out.println("No" + " "+(person.length()-count));
      }
      sc.close();
    }
}
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String have = sc.next();
        String need = sc.next();

        //商人手上珠子的统计
        Map<Character,Integer> map = new HashMap<>();
        for(char c : have.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        //用户需要的珠子统计
        Map<Character,Integer> n = new HashMap<>();
        for(char c : need.toCharArray()){
            if(n.containsKey(c)){
                n.put(c,n.get(c) + 1);
            }else{
                n.put(c,1);
            }
        }
        //计算差值
        boolean w = true;
        int lack = 0;
        for(Map.Entry<Character,Integer> cur : n.entrySet()){
            char c = cur.getKey();
            int value = cur.getValue();
            if(map.containsKey(c) && map.get(c) < value){
                w = false;
                lack += value - map.get(c);
            }else if(!map.containsKey(c)){
                w = false;
                lack += value;
            }
        }

        if(w){
            System.out.println("Yes" + " " + (have.length() - need.length()));
        }else{
            System.out.println("No" + " " + lack);
        }
    }
}