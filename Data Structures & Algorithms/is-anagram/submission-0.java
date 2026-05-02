class Solution {
    public boolean isAnagram(String s, String t) {
        // loop into both of them to get it hashtable key if key match  Anagram

        if(s.length() != t.length()) return false;
        int[] hash = new int[26]; 
        for(char c : s.toCharArray()){
            hash[c - 'a']++;
        }
 
         for(char c : t.toCharArray()){
            hash[c - 'a']--;
        }

        for(int e: hash){
            if(e!=0){
                return false;
            }
        }
        return true;

    }
}
