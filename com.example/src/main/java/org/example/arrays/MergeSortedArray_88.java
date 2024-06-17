package org.example.arrays;


import java.util.Arrays;

public class MergeSortedArray_88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int fullSize = m+n-1;
        while( index2 >= 0 ){
            if(index1>=0 && nums1[index1] > nums2[index2]){
                nums1[fullSize]=nums1[index1];
                index1--;
                fullSize--;
            }
            else{
                nums1[fullSize]=nums2[index2];
                index2--;
                fullSize--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        merge(new int[]{1}, 1, new int[]{}, 0);
        merge(new int[]{0}, 0, new int[]{1}, 1);
    }
}
