class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int idx = 0;

        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                arr[idx++] = nums[i];
            }
        }

        while(idx != n){
            arr[idx++] = 0;
        }

        idx = 0;
        for(int num : arr){
            nums[idx++] = num;
        }
    }
}