class NextPermutation {
    public void nextPermutation(int[] nums) {
        
      boolean f=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])f=true;
        }
        if(f){
      int x=0;
        for(int i =nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1])
            { x=i;
            break;}
        }
     
        int y=0;
        for(int i=x+1;i<nums.length;i++){
            if(nums[x]<nums[i])
            { y=i;}
        }
      
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
       
        int s=x+1;
        int l =nums.length-1;
        while(s<l){
             int tem=nums[s];
        nums[s]=nums[l];
        nums[l]=tem;
            s++;
            l--;
        }
        }
        else{
            int s=0;
            int l =nums.length-1;
         while(s<l){
             int tem=nums[s];
        nums[s]=nums[l];
        nums[l]=tem;
            s++;
            l--;
        }
 }
    }
}