class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] answer = new int[nums.length];
         int product = 1;
        for(int i=0;i<left.length;i++){
            left[i]=product;
            product = product*nums[i];
        }
        product = 1;
        for(int i=right.length-1;i>=0;i--){
            right[i]=product;
            product = product*nums[i];
        }
        for(int i=0;i<answer.length;i++){
            answer[i]=left[i]*right[i];
        }
        return answer;
    }
}  
