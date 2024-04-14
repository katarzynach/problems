package org.example.arrays;

public class Problem {
        public int removeDuplicates(int[] nums) {
            int index = 1;
            int max = 2;
            int counter = 1;
            for(int i=0; i<nums.length-1; i++){
                if(nums[i+1] == nums[i]){
                    if(counter < max){
                        nums[index] = nums[i+1];
                        index++;
                    }
                    counter++;
                }
                else
                {
                    counter = 1;
                    nums[index] = nums[i+1];
                    index++;

                }

            }
            return index;
        }
}
