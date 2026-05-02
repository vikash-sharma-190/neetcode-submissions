class Solution {
    public String longestCommonPrefix(String[] strs) {
        // for(int i=0;i<strs[0].length();i++){
        //     for(String s : strs){
        //         // "bac" "bac" "bacd"
        //         if(i == s.length() || strs[0].charAt(i) != s.charAt(i)){
        //             return s.substring(0,i);
        //         }
        //     }
        // }
        // return strs[0];

        Arrays.sort(strs);
        int l = strs[0].length();
        int r = strs[strs.length-1].length();

        int length = Math.min(l,r);

        for(int i=0;i<length;i++){
            if(strs[0].charAt(i) != strs[strs.length-1].charAt(i)){
                return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}