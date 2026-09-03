class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }

        Map<Character,Character> mp= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char or= s.charAt(i);
            char re= t.charAt(i);

            if(!mp.containsKey(or)){
            if(!mp.containsValue(re)){
                mp.put(or,re);
            }else{
                return false;
            }
            } else{
                char maped= mp.get(or);
                if(maped != re){
                    return false;
                }
            }

        }
        return true;
    }
}