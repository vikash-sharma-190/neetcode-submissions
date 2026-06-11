class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> size = new ArrayList<>();
        for(String s : strs){
           size.add(s.length());
        }

        for(int s: size){
            res.append(s).append(",");
        }

        res.append("#");

        for(String s : strs){
            res.append(s);
        }
        return res.toString();

       
    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        List<Integer> size = new ArrayList<>();
        int i = 0;

         //2,4,4,4#hithishell

         while(str.charAt(i)!='#'){
            StringBuilder curr = new StringBuilder();
            while(str.charAt(i)!=','){
                curr.append(str.charAt(i));
                i++;
            }
            size.add(Integer.parseInt(curr.toString()));
            i++;
         }
         i++;
         for(int s : size){
            res.add(str.substring(i,i+s));
            i+=s;
         }
         return res;
    }
}
