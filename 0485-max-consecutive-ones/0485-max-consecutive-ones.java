class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countOne = 0;
        int consecutiveOne = 0;

        for(int num : nums){
            if(num == 1){
                countOne++;
                consecutiveOne = Math.max(consecutiveOne , countOne);
            }
            else{
                countOne = 0;
            }
        }
        return consecutiveOne;
    }
}