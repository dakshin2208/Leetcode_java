package leetcode;

public class arraywithinfinitenumbers {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

    }
    static int ans (int [] arr , int target ) {
        //first start with a box of size 2
        int start = 0;
        int end = 1;
        //condition for the target
        while (target > arr[end]) {
            int temp = end + 1;
            //double the box value
            end = end + (start - end + 1) * 2;
            start = temp;

        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
