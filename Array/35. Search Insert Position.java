public class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int l = nums.length;
        while(nums[i]<target&& l >1){
            i++;
            l--;
            if(nums[i]==target)
                return i;
        }
        if(nums[i]<target){
            return i+1;
        }else{
        return i;
        }
    }
}