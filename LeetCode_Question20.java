class LeetCode_Question20 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        if(s.length()==1){
            return false;
        }
        boolean ans=true;
       
        HashMap<Character, Character> mappings=new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('||ch=='{'||ch=='['){
                
                stack.push(ch);
                
            }
            if(ch==')'||ch=='}'||ch==']'){
                if(!stack.isEmpty()){
                char temp=stack.pop();
                
                char check=mappings.get(ch);
                
                if(temp==check){
                    
                }
                else{
                    ans=false;
                }
            }
            
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
                            
        
        return ans;
    }
}