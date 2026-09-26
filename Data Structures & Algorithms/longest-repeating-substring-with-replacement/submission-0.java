class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int[] fre = new int[26];
        int maxFreq = 0;
        int maxLength = 0;
        
        for(int right=0;right<s.length();right++){
            fre[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq, fre[s.charAt(right)-'A']);
            if(right-left+1 - maxFreq >k){
                fre[s.charAt(left)-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
