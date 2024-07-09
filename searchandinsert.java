package leetcode;

public class searchandinsert {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int ans = ans(nums, target);
        System.out.println(ans);

    }

    static int ans(int[] nums, int target) {
         int[] ans = -1;


    }





    static int searchanddinsert(int [] nums , int target){
        int start =0;
        int end = nums.length -1;
        while (start<end){

            int mid = start +(end - start) / 2 ;

            if(nums[mid] < target){
                start = mid +1;
            }else if(nums[mid] > target){
                end = mid -1;
            }else {
                return mid;
            }



        }
        //if target is not found  , return the position where it should be inserted.
        return end ;



    }
}
