class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // int number=0;
        for(int i=0;i<nums.length;i++){
            int number = target-nums[i];
            if(!map.containsKey(number)){
               map.put(nums[i],i);
            }
            else {
                return new int[]{map.get(number), i};
            }
        }
        return new int[]{-1,-1};
    }
}
