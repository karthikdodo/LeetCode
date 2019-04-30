class LeetCode_Question58 {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        int n=arr.length;
        if(n==0){
            return 0;
        }
        else{
            String st=arr[n-1];
            return st.length();
        }
    }
}