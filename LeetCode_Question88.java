import java.io.*;
import java.util.*;
class LeetCode_Question88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        n=n-1;
        for(int i=0;i<nums1.length;i++)
        {  
            if(n>=0)
            { 
            if(nums1[i]==0)
            {
                
                
                    nums1[i]=nums2[n]; 
                    n--;
        
                
            }
            }
            
            
        }
        
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
        
    }
}