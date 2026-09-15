class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>(2);
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
       List<Integer> sortedKeys = map.entrySet().stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue())) // Sort by frequency descending
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = sortedKeys.get(i);
        } 
        return result;
    }
}
