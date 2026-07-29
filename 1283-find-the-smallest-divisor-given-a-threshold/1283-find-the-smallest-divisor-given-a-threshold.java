class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int low =1;
        int high = getmax( nums);
        while(low<high){
           int mid=(low+high)/2;
            if(small(nums,mid)<=threshold){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }

    public int small(int[] nums, int mid){
        int sum=0;
        for(int num:nums){
            sum+=Math.ceil((double)num/(double)mid);
        }
        return sum;
    }

    public int getmax(int[] nums){
        int max=nums[0];
        for(int num:nums){
            max=Math.max(max,num);
        }
        return max;
    }
}