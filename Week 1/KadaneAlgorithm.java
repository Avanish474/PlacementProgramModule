class KadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int csum=nums[0];
        int overall = nums[0];
        for(int i = 1;i < nums.length; i++){
            if(csum>=0){
                csum+=nums[i];
            }
            else csum =nums[i];
            
            if(overall<csum)overall = csum;
            
        }
        return overall;
    }
}