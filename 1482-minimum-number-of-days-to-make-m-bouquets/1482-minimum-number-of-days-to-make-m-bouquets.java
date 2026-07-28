class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

long val = (long) m * k; // use long to avoid overflow too
        if (val > bloomDay.length) {
            return -1;
        }
        int low= getmin(bloomDay);
        int high= getmax(bloomDay);

        while(low<high){
            int mid = (low+high)/2;
           
            if(possible(bloomDay,mid,m,k)){
                high=mid;
            }else{
                low=mid+1;
            }

        }
return low;
        
    }

    public boolean possible(int[] bloomDay,int med,int m,int k){
        int count=0;
        int nob=0;
        for(int bloom:bloomDay){
            if(bloom<= med){
                count++;
            }else{
                nob+= count/k;
                count=0;
            }
        }
        nob+= count/k;
   return nob >= m;
    }

public int getmin(int[] bloomDay){
    int min = bloomDay[0];
    for (int i = 1; i < bloomDay.length; i++) {
        min = Math.min(min, bloomDay[i]);
    }
    return min;
}

public int getmax(int[] bloomDay){
    int max = bloomDay[0];
    for (int i = 1; i < bloomDay.length; i++) {
        max = Math.max(max, bloomDay[i]);
    }
    return max;
}
}