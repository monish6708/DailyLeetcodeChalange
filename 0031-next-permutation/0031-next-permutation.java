class Solution {
    public void nextPermutation(int[] nums) {

        int n= nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums, 0, n - 1);
            return;
        }

        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[index]){
                int temp= nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                break;
            }

        }
        reverse(nums, index + 1, n - 1);
        // return nums;
        
    }

    private void reverse(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }
}