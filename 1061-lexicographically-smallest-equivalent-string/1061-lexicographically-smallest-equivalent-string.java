class Solution {
    public class DSU{
        int par[];
        DSU(int n){
            n++;
            par=new int[n];
            for(int i=0;i<n;i++){
                par[i]=i;
            }
            
        }
        public void union(int v1,int v2){
            int p1=find(v1);
            int p2=find(v2);
            if(p1==p2)return;
            if(p1>p2){
                par[p1]=p2;

            }else{
                par[p2]=p1;            }
        }
        public int find(int v1){
            if(par[v1]==v1)return v1;
            return par[v1]=find(par[v1]);
        }
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        
        DSU uf=new DSU(26);
        if(s1.length()!=s2.length())return null;
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            uf.union(ch1-'a',ch2-'a');
        }

        StringBuilder sb=new StringBuilder();
        for(char ch:baseStr.toCharArray()){
            sb.append((char)(uf.find(ch-'a')+'a'));
        }
        return sb.toString();

    }
}