class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char x : s.toCharArray()){
                count[x - 'a']++;
            }
            String key = Arrays.toString(count);
            System.out.println(key);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        System.out.println(map.values());
        return new ArrayList<>(map.values());
    }
}
