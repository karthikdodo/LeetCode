class LeetCode_Question9 {
    public boolean isPalindrome(int x) {
        int k = x,temp=0;
        
         if(x<0) 
         {
             return false;
         }
        else{
        while(k!=0)
        {
        temp=temp*10+k%10;
            k=k/10;
        }
        if (temp==x)
        {
            return true;
            
        }
        else{
            return false;
        }
        }
        
    }
}