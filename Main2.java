public class Main2 {
    public int addAB(int A,int B){
        while (B != 0){
            int sum = A ^ B;//1+1=0;1+0=1;0+1=1;0+0=0,所以采用异或来计算相加
            int carry = (A & B)<<1;//考虑进位，若进位为0，则跳出循环
            A = sum;
            B = carry;
        }
        return A;//返回相加的和
    }

    public static void main(String[] args) {
        Main2 main = new Main2();
        int a = main.addAB(3,5);
        System.out.println(a);
    }
}
