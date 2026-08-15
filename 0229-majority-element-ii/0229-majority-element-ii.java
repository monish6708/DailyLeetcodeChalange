class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len= nums.length;
        int div= len/3;
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<len;i++){
            int count=0;
            if(list.size()==0 || list.get(0)!=nums[i]){
            for(int j=i;j<len;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>div){
                list.add(nums[i]);
            }
            if(list.size()==2){
                break;
            }
        }
        }
        return list;
    }
}