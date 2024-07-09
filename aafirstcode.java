package leetcode;

public class aafirstcode {
    //1295. Find Numbers with Even Number of Digits
    public static void main(String[] args) {
        int[]nums = {12,345,2,6,7896};
        int result= findvalues(nums);
        System.out.println(result);

    }
    static int findvalues(int [] nums)
    {
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(element(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }
    static int element(int element) {
        int count = 0;
        while(element>0){
            count++;
            element=element/10;
        }
        return count;
    }

    public static class binarysearch {
        public static void main(String[] args) {
            int [] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,48,89};
            int target = 22;
            int ans = binarysearch(arr,target);
            System.out.println(ans);

        }
        static int binarysearch(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start +(end-start)/2;
                if(target<arr[mid]){
                    end = mid-1;
                }
                else if (target>arr[mid]){
                    start =mid+1;
                }else{
                    return mid;
                }
            }
            return -1;
        }
    }
}
