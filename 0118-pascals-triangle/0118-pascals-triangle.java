class Solution {
    public List<List<Integer>> generate(int numRows) {
List<List<Integer>> ans = new ArrayList<List<Integer>>() ;
for(int i=1;i<=numRows;i++){
    ans.add(genrow(i));
}
return ans;
        
        
    }

    public List<Integer> genrow(int row){
      int ans =1;
        List<Integer> ansrow = new ArrayList<>();
        ansrow.add(ans); 
        for(int i=1;i<row;i++){
            ans=ans * (row-i);
            ans= ans/(i);
            ansrow.add(ans);
        }
        return ansrow;
    }
}