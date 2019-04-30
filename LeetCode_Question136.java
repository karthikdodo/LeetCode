class LeetCode_Question136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int t=hm.get(nums[i]);
                hm.put(nums[i],t+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            if(entry.getValue()==1){
             ans=entry.getKey() ;  
            }
        } 
    
        return ans;
    }
}