package leetcode;

public class mountainarray {
    public static void main(String[] args) {
        int[] arr= {0,1,0};
        System.out.println(peakIndexInMountainArray(arr));

    }
   static int peakIndexInMountainArray(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while (start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                //you are at dec path of the array
                //this may be the ans,but look the left side
                end =mid;
            }else{
                //you are at asc path of the array
                start = mid+1;
                //because we know that mid+1 element >mid element
            }

        }
        //because both the start and end index point towards the one index
        return start;//or return end as  both are equal
    }
}