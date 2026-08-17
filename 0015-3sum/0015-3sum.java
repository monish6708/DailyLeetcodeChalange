class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
    //     for(int i=0;i<nums.length;i++){
    //          for(int j=i+1;j<nums.length;j++){
    //              for(int k=j+1;k<nums.length;k++){
    //                 if(nums[i]+nums[j]+nums[k]==0){
    //                     List<Integer> temp= new ArrayList<>();
    //                     temp.add(nums[i]);
    //                     temp.add(nums[j]);
    //                     temp.add(nums[k]);
    //                     Collections.sort(temp); 
    //                     set.add(temp);
    //                 }
    //              }
    //          }
    //     }
    //   list.addAll(set);
    //     return list;
    // exceed time limit error
    for(int i=0;i<nums.length;i++){
        Set<Integer> tempset= new HashSet<>();
          for(int j=i+1;j<nums.length;j++){
            // List<Integer> templist= new ArrayList<>();
            int k = -(nums[i]+nums[j]);
                if (tempset.contains(k)) {
                    List<Integer> templist = new ArrayList<>();
                    templist.add(nums[i]);
                    templist.add(nums[j]);
                    templist.add(k);
                    Collections.sort(templist);
                    set.add(templist);
                }
                tempset.add(nums[j]);
            

          }
        }
        list.addAll(set);
        return list;
    }
}