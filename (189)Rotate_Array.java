//189. Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
        
        int x=0;
        while(k!=0)
        {
            x = nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--)
            {
                nums[i] = nums[i-1];
            }
            nums[0]=x;
            k--;
        }    
    }
}