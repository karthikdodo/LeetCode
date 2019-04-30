class LeetCode_Question121 {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int p=prices[j]-prices[i];
                if(p>max){
                    max=p;
                }
            }
        }
        return max;
    }
}