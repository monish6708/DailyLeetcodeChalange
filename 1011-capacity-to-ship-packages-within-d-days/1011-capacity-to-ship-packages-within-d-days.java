class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low= getmax(weights);
        int high= getsum(weights);
        while(low <high){
            int mid = (low+high)/2;
            int day= days(weights,mid);
            if(day<= days){
                high=mid;
            }else{
                low=mid+1;
            }


        }
        return low;


        
    }

    public int days(int[] weights,int mid){
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+load <= mid){
               load+=weights[i];
            }else{
                
                  days+=1;
                load=weights[i];
            }
        }
        return days;
    }

    public int getmax(int[] weights){
        int max=0;
        for(int num: weights){
            max= Math.max(max,num);
        }
        return max;
    }

    public int getsum(int[] weights){
        int sum=0;
        for(int num:weights){
            sum+=num;
        }
        return sum;
    }
}