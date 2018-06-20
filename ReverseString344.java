//解题思路：使用递归将字符串进行分隔，并进行翻转

class Solution {
    public String reverseString(String s) {
        
                int n=s.length();
        if(n<=1){
            return s;
        }
        String s1=s.substring(0,n/2);
        String s2=s.substring(n/2,n);
        return reverseString(s2)+reverseString(s1);
    }

}