class Solution {
    private boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'){
            return true;
        }
        if(c=='A' || c=='E' || c=='I'|| c=='O' || c=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = s.length()-1;
        System.out.println("end = "+end);
        while(start<end){
            if(!isVowel(s.charAt(start))){
                start++;
            }
            if(!isVowel(s.charAt(end))){
                end--;
            }
            if(isVowel(s.charAt(start)) && isVowel(s.charAt(end))){
                char temp = s.charAt(start);
                sb.setCharAt(start, s.charAt(end));
                sb.setCharAt(end, temp);
                start++;
                end--;
            }
        }
        return sb.toString();
    }
}