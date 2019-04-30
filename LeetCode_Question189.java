class LeetCode_Question189{
    public void rotate(int[] nums, int k) {
        int v=nums.length-1;
        while(k!=0){
        for(int j=0;j<nums.length-1;j++){
            int temp=nums[j];
            nums[j]=nums[v];
            nums[v]=temp;     
        }
        k--;
        }
        
    }
}