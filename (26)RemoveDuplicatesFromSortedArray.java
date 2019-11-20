//6. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }
        int j=0,i;
        
        int ref = nums[j];
        for(i=0;i<nums.length;i++)
        {
            if(ref != nums[i])
            {
                j = j + 1;
                nums[j]=nums[i];
                ref = nums[j];
            }
        }
        return j+1;
    }
}
