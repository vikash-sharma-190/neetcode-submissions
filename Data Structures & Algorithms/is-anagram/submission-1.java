class Solution {
    public boolean isAnagram(String s, String t) {
        // loop into both of them to get it hashtable key if key match  Anagram

        if(s.length() != t.length()) return false;
        int[] hash = new int[26]; 
        // for(char c : s.toCharArray()){
        //     hash[c - 'a']++;
        // }
 
        //  for(char c : t.toCharArray()){
        //     hash[c - 'a']--;
        // }

        int n = s.length();

        for(int i=0;i<n;i++){
            hash[s.charAt(i) - 'a']++;
            hash[t.charAt(i) - 'a']--;
        }

        for(int e: hash){
            if(e!=0){
                return false;
            }
        }
        return true;

    }
}
