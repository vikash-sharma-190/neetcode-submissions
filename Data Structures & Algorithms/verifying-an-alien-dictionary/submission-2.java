public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
       int[] orderArr = new int[26];

       for(int i = 0; i < order.length(); i++){
            orderArr[order.charAt(i) - 'a'] = i; 
        }

       for(int i = 0 ; i < words.length - 1; i++){
            if (!checkOrder(words[i], words[i + 1], orderArr)) {
                return false;
            }
        }

        return true;

    //    for(int i =0 ; i<words.length - 1 ; i++){
    //         String first = words[i];
    //         String sec = words[i+1];

    //         int len = Math.min(first.length(),sec.length());

    //         for(int j=0;j<len;j++){
    //             if(first.charAt(j)!=sec.charAt(j)){
    //                 return orderArr[first.charAt(j)-'a'] < orderArr[sec.charAt(j)-'a'];
    //             }
    //         }
    //         return first.length()<=sec.length();
    //    }
    //    return true;
    }

            public  boolean checkOrder(String s1, String s2, int[] orderArr){
            int len = Math.min(s1.length(), s2.length());

            for(int j = 0; j < len; j++){
                char char1 = s1.charAt(j);
                char char2 = s2.charAt(j);
                if(char1 != char2){
                    return orderArr[char1 - 'a'] < orderArr[char2 - 'a'];
                }
            }

            // if we reach here, one word is the prefix of other, so the shorter must come first
            return s1.length() <= s2.length();
               
        }
}