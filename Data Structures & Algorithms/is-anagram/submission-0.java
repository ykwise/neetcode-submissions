class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

           
                sMap.put(ch,sMap.getOrDefault(ch,0)+1);
            
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);

            
                tMap.put(ch,tMap.getOrDefault(ch,0)+1);
            
        }

        if(sMap.equals(tMap)){
            return true;
        }else{
            return false;
        }

    }
}
