class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String sorted = new String(str);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
