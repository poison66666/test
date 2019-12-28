import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student {
    public String name;
    public int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
}
public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            //输入人数
            int numPerson = sc.nextInt();
            //排序策略
            int option = sc.nextInt();
            List<Student> list = new ArrayList<>();
            for(int i = 0;i<numPerson;i++){
                //输入姓名和成绩
                list.add(new Student(sc.next(),sc.nextInt()));
            }
            if(option == 1){
                //升序
                list.sort((o1,o2)->o1.score-o2.score);
            }else if(option == 0){
                //降序
                list.sort((o1,o2)->o2.score-o1.score);
            }

            for(Student student : list){
                System.out.println(student.name + " " + student.score);
            }
        }
    }
}
