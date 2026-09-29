class Solution {
    public int longestConsecutive(int[] nums) {

        // int longest=0;
        // for(int i=0;i<nums.length;i++){
        //      if (check(nums, nums[i] - 1)) continue;
        //     int count = 1;
        //     int x = nums[i];
        //     while (check(nums, x + 1)) {
        //         x++;
        //         count++;
        //     }
        //     longest = Math.max(longest, count);
        // }
        // return longest;

        //BRUTE FORCE AAP WITH TIME EXCEED 

         Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

                int longest = 0;

        for (int num : set) {
            // Only start counting if this is the beginning of a sequence
            if (!set.contains(num - 1)) {
                int x = num;
                int count = 1;

                while (set.contains(x + 1)) {
                    x++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;


        
    }

    public boolean check(int[] arr,int value){
        for(int i=0;i< arr.length;i++){
            if(value==arr[i]){
                return true;
            }
        }
        return false;
    }
}