class Solution {
    public int missingNumber(int[] nums) {
        
        int result = nums.length;
        for(int i=0;i<nums.length;i++){
            result = result ^ (nums[i]^i);
        }
        return result;
        // int n = nums.length;
        // int sum = n * (n + 1) / 2;

        // int actualSum = 0;
        // for (int i : nums) {
        //     actualSum = actualSum + i;
        // }
        // return sum - actualSum;
    }
}
