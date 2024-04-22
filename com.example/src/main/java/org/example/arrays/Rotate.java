package org.example.arrays;

public class Rotate {
    public void rotate(int[] nums, int k) {
        int n =  nums.length;
        int i,j;
        k = k % nums.length;

        for(i = n - k, j = n-1; i < j; i++, j-- ){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (i = 0, j = n - k - 1; i < j; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (i = 0, j = n - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

    }
}
