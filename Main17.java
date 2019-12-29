import java.util.*;
class Person {
    String name;
    int score;
    public Person(String name,int score){
        this.name = name;
        this.score = score;
    }
}

public class Main17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> students = new HashMap<>();
        while (sc.hasNext()) {
            int person = sc.nextInt(); //输入人数
            int bool = sc.nextInt(); //判断输出是由高到低还是由低到高(排序方式)
            List<Person> list = new ArrayList<>();
            for (int i = 0; i < person; i++) {
               list.add(new Person(sc.next(),sc.nextInt()));
            }
            if(bool == 0){
                //降序
                list.sort((o1,o2)-> o2.score - o1.score);
            }else if(bool == 1){
                //升序
                list.sort((o1,o2)-> o1.score - o2.score);
            }
            for(Person p : list){
                System.out.println(p.name + " "+ p.score);
            }
          /* //for(Map.Entry<String,Integer> map : students.entrySet()){
                if(bool == 1){
                    List<Map.Entry<String,Integer>> entryList1 = new ArrayList<>(students.entrySet());
                    Collections.sort(entryList1,((o1,o2)-> {
                        return o1.getValue().compareTo(o2.getValue());
                    }));
                    entryList1.forEach(o-> {
                        System.out.println(o.getKey() + " " + o.getValue());
                    });
                }else if(bool == 0){
                    List<Map.Entry<String,Integer>> entryList = new ArrayList<>(students.entrySet());
                    Collections.sort(entryList,((o1,o2)-> {
                        return o2.getValue().compareTo(o1.getValue());
                    }));
                    entryList.forEach(o-> {
                        System.out.println(o.getKey() + " " + o.getValue());
                    });
                }
         //  }*/
        }
    }
}
