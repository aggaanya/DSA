class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
     
        int m=g.length,n=s.length;
        int l=0,r=0;
        while(l<m && r<n){
            if(s[r]>=g[l]){l++;}
     r++;}
        return l;
    }
}