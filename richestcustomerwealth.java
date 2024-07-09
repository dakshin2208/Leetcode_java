package leetcode;

import java.lang.reflect.Array;

public class richestcustomerwealth {
    public static void main(String[] args) {
        int [][] accounts =  {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        int ans = maximumwealth(accounts);
        System.out.println(ans);
    }
    static int maximumwealth(int[][]accounts){
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < accounts.length; row++) {
            int sum = 0 ;
            for(int col= 0 ; col < accounts[row].length;col++){
                sum = sum+accounts[row][col];
            }
            if(sum>max){
                max= sum;
            }

        }
        return max;
    }



}
