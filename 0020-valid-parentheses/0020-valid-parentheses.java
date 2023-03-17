class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()>0){
            stack.push(s.charAt(0));
        }
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                if(!stack.isEmpty()){
                    char ch = stack.peek();
                    if((s.charAt(i) == ')' && ch == '(') || (s.charAt(i) == '}' && ch == '{') || (s.charAt(i) == ']' && ch == '[')){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}