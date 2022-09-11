class Solution {
    public int partitionString(String s) {
        List<Character> list = new ArrayList<>();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(list.contains(s.charAt(i))){
                count++;
                list = new ArrayList<>();
                list.add(s.charAt(i));
            }else{
                list.add(s.charAt(i));
            }
        }
        return count+1;
    }
}