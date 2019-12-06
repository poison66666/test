/*
import java.util.*;

public class Gift {
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int mid = gifts[n/2];
        int num = 0;
        for(int i = 0;i < gifts.length;i++){
            if(gifts[i] == mid){
                num++;
            }
        }
        return num < n/2 ? 0 : mid;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,2,2};
        Gift gift = new Gift();
        int print = gift.getValue(arr,5);
        System.out.println(print);
    }
}*/

import java.util.Arrays;

public class Gift {
    public int getValue(int[] gifts, int n) {
        /*Arrays.sort(gifts);
        int ans = gifts[n/2];
        int num = 0;
        for(int i = 0;i<gifts.length;i++){
            if(gifts[i] == ans){
                num++;
            }
        }
        return num <= n/2 ? 0:ans;*/

        if(gifts.length < n) return 0;
        if(gifts.length == 0) return 0;
        int count = 0,temp = 0;
        for(int i = 0;i<n;i++){
            if(count == 0){
                temp = gifts[i];
                count = 1;
            }else{
                if(temp == gifts[i]){
                    count++;
                }else{
                    count--;
                }
            }

        }
        int size = 0;
        for(int i = 0;i<n;i++){
            if(temp == gifts[i]){
                size++;
            }
        }
        return (size > n/2) ? temp : 0;
    }
}