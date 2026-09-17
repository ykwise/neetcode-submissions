class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        
        String prefix = strs[0];

        for(int i=0;i<prefix.length();i++){
            char ch = prefix.charAt(i);

            for(int j=1;j<strs.length;j++){
                if(strs[j].length()<=i || strs[j].charAt(i) != ch)
                {
                    return prefix.substring(0,i);
                }
            }
        }
        return prefix;
    }
}