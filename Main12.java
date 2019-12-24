public class Main12 {
    public int addAB(int A,int B){
        if(B == 0){
            return A;
        }
        int sum = A ^ B;//相加但无进位
        int jinWei = (A & B) << 1; //进位但不相加
        return addAB(sum,jinWei);//相加
    }
    public static void main(String[] args) {
        Main12 main = new Main12();
        int a = main.addAB(2,3);
        System.out.println(a);
    }
}
