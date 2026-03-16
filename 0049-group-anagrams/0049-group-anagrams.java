class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s1:strs)
        {
            char c[]=s1.toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if(!map.containsKey(s))
            {
                map.put(s,new ArrayList<>());

            }
            map.get(s).add(s1);
        }
        return new ArrayList<>(map.values());
    }
}