class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
        // brute-force
        // int max = Integer.MIN_VALUE;
        //  for (int i = 0; i < s.length(); i++) {
        //      HashSet<Character> set = new HashSet<>();
        //      for (int j = i; j < s.length(); j++) {
        //          if (set.contains(s.charAt(j))) {
        //              break;
        //          }
        //          set.add(s.charAt(j));
        //          max = Math.max(max, set.size());
        //      }
        //  }
        //  return max;
    }
}
