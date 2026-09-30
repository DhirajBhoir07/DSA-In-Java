class Solution {
   public int[] sortedSquares(int[] nums) {
        int [] result = new int[nums.length];
        int i = 0, j = nums.length-1;
        int k = result.length -1;
        while (i<= j){
            if(Math.abs(nums[i]) < Math.abs(nums[j])){
                result[k] = nums[j] * nums[j];
                k--;
                j--;
            }else{
                result[k] = nums[i] * nums[i];
                k--;
                i++;
            }
        }
        return result;
    }
}