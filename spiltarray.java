package leetcode;


public class spiltarray {
    public static void main(String[] args) {
        int [] nums = {7,2,5,8,10};
        int m = 2;
        int ans = splitArray( nums , m );
        System.out.println((ans));

    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int j : nums) {
            start = Math.max(start, j); // in the end of the loop
            // this will contain the max item for the array
            end += j;

        }
        //binary search
        while (start < end) {
            //try for the middle as potential ans
            int mid = start + (end - start) / 2;
            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }

            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;//here start = end =mid...
    }
}


