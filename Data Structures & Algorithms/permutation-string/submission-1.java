class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        int[] count2 = new int[26];
        int left = 0;
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }
        for (int right = 0; right < s2.length(); right++) {
            count2[s2.charAt(right) - 'a']++;
            if (right - left + 1 > s1.length()) {
                count2[s2.charAt(left) - 'a']--;
                left++;
            }
            if (Arrays.equals(count, count2))
                return true;
        }
        return false;
    }
}
