/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] A = new int[n];
            for(int i=0;i<n;i++){
                A[i] = in.nextInt();
            }
            int start = 0;
            ArrayList<int[]> result = new ArrayList<int[]>();

            Permutation(A,start,n,result);
            Set<String> sortResult = new TreeSet<String>();

            for(int[] out:result){
                if(isLegal(A,out,n)){
                    StringBuilder sb = new StringBuilder();
                    for(int i=0;i<n-1;i++){
                        sb.append(out[i]+" ");
                    }
                    sb.append(out[n-1]);
                    sortResult.add(sb.toString());
//                  System.out.println(sb.toString());
                }
            }
            for(String list:sortResult){
                System.out.println(list);
            }
        }
        in.close();

    }
    private static boolean isLegal(int[] in,int[] out,int n){
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int i=0;
        int j=0;
        while(i<n){ // in 还有元素的时候都需要判断
            if(in[i] == out[j]){ //  相等时候就不用入栈，直接后移
                i++;
                j++;
            }else{
                if(stack.isEmpty()){ //空stack 就只有入栈了
                    stack.push(in[i]);
                    i++;
                }else{
                    int top = stack.peek(); // 栈顶元素相等，进行出栈
                    if(top ==out[j]){
                        j++;
                        stack.pop();
                    }else if(i<n){ //  不等时候入栈
                        stack.push(in[i]);
                        i++;
                    }
                }
            }
        }
        while(!stack.isEmpty() && j<n){ // in 的结束后，栈中元素进程出栈序列应该和out剩余的元素 相同
            int top = stack.pop();
            if(top == out[j]){
                j++;
            }else{
                return false;
            }
        }
        return true;

    }
    */

import java.util.*;

/**
     * 求出所有排列
    // * @param A
    // * @param start
    // * @param n
    // * @param result
     *//*

    private static void Permutation(int[] A,int start,int n,ArrayList<int[]> result){
        if(start == n){
            return;
        }
        if(start == n-1){
            int[] B = A.clone();
            result.add(B);
            return;
        }
        for(int i=start;i<n;i++){
            swap(A,start,i);
            Permutation(A,start+1,n,result);
            swap(A,start,i);
        }

    }
    private static void swap(int[] A,int i,int j){
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }

}
*/
public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] A = new int[n];
            for(int i = 0; i<n;i++){
                A[i] = in.nextInt();
            }
            int start = 0;

            ArrayList<int[]> result = new ArrayList<>();
            //将所有排序结果放在result里面
            Permutation(A,start,n,result);
            //进行排序

            Set<String> sortResult = new TreeSet<>();
            for(int[] out : result){
                //判断排序结果是否符合出栈顺序
                if(isLegal(A,out,n)){
                    StringBuilder sb = new StringBuilder();
                    for(int i = 0; i <n-1;i++){
                        sb.append(out[i]+ " ");
                    }
                    sb.append(out[n-1]);
                    //最终将其放进sortResult集合里面
                    sortResult.add(sb.toString());
                }
            }
            //遍历sortResult集合，输出
            for(String list:sortResult){
                System.out.println(list);
            }
        }
        //关闭输入
        in.close();
    }

    private static boolean isLegal(int[] in, int[] out, int n) {
        LinkedList<Integer> stack = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (i < n){
            //如果in和out相等，直接后移
            if(in[i] == out[j]){
                i++;
                j++;
            }else {
                //如果栈为空，直接入栈
                if(stack.isEmpty()){
                    stack.push(in[i]);
                    i++;
                }else{
                    int top = stack.peek();
                    //如果与栈顶元素相等，出栈
                    if(top == out[j]){
                        j++;
                        stack.pop();
                    }else if(i < n){
                        //不相等时入栈
                        stack.push(in[i]);
                        i++;
                    }
                }
            }
        }
        //入栈结束，栈中元素出栈顺序应与out中的剩余元素一致
        while (!stack.isEmpty() && j < n){
            int top = stack.pop();
            if(top == out[j]){
                j++;
            }else {
                return false;
            }
        }
        return true;
    }

    private static void Permutation(int[] A, int start, int n, ArrayList<int[]> result) {
        //超出界限
        if(start == n){
            return;
        }
        //只有一个元素
        if(start == n-1){
            int[] B = A.clone();
            result.add(B);
            return;
        }
        //超过一个元素
        for(int i = start;i<n;i++){
            swap(A,start,i);
            Permutation(A,start+1,n,result);
            swap(A,start,i);
        }
    }

    private static void swap(int[] A, int i, int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }

}