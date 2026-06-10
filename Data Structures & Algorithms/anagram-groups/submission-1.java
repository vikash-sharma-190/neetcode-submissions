class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res= new HashMap<>();
        for(String s : strs){
            char[] charArry = s.toCharArray();
            Arrays.sort(charArry);
            String sortedS = new String(charArry);
            res.putIfAbsent(sortedS,new ArrayList<>());
            res.get(sortedS).add(s); 
        }

        return new ArrayList<>(res.values());
    }
}
