import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0;i<10;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Get(nums));
    }

    private static String Get(int[] nums) {
        String s = "";
        for(int i = 1;i < nums.length;i++){
            if(nums[i] != 0) {
                s += i;
                nums[i]--;
                break;
            }
        }

        for(int i = 0;i <nums.length;i++){
            while (nums[i] != 0){
                s+=i;
                nums[i]--;
            }
        }
        return s;
    }
}