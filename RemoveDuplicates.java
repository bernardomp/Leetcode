class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int prev = Integer.MIN_VALUE;
        
        for(int i = 0; i<nums.length; i++) {
            
            if(prev!=nums[i]) {
                count++;
                prev = nums[i];
            }
            
            else {
                
                for(int j = i; j<nums.length-1;j++){
                    nums[j] = nums[j+1];
                }
                
            }
            
        }
        
        return count;
    }
}
