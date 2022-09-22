class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        String temp = "";
        StringBuilder res = new StringBuilder();
        int i = 0;
        for(i = 0;i<strArr.length-1;i++){
            temp = new StringBuilder(strArr[i]).reverse().toString();
            res.append(temp);
            res.append(" ");
        }
        temp = new StringBuilder(strArr[i]).reverse().toString();
        res.append(temp);
        return res.toString();        
    }
}