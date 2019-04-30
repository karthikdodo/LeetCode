class LeetCode_Question162 {
    public int findPeakElement(int[] nums) {
        if(nums.length==2){
            if(nums[0]>nums[1]){
                return 0;
            }
            else{
                return 1;
            }
        }
        int peakelement=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                if(i==nums.length-2){
                    peakelement=i+1;
                }
                continue;
            }
            else{
                peakelement=i;
                break;
            }
        }
        return peakelement;
        
    }
}