class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low=1;
        int high= getmax(piles);
        while(low < high){
            int mid= (low + high)/2;
            int totalhours= getTotal( piles,mid);
            if(totalhours<=h){
                high= mid;
            }else{
                low=mid+1;
            }
       
        }
        
        return low;
    }

    public int getTotal(int[] piles, int med){
        int total=0;
        for(int i=0;i<piles.length;i++){
            total+=Math.ceil((double)piles[i]/(double)med);
        }
        return total;
    }

    public int getmax(int [] piles){
        int max=0;
        for(int i=0;i<piles.length;i++){
            max= Math.max(max,piles[i]);
        }
        return max;
    }
}