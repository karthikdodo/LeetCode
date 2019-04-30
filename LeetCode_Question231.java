class LeetCode_Question231 {
    public boolean isPowerOfTwo(int n) {
        if(n!=0){
        while(n%2==0){
            n=n/2;
        }
        return 1==n;
        }
        else{
            return false;
        }
        
    }
}