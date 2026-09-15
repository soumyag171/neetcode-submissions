class Solution {
    public boolean isAnagram(String s, String t) {
     HashMap<Character, Integer> map = new HashMap<>();
      boolean flag = false;
     if(s.length()!=t.length()){
        return flag;
     }

     char[] c = s.toCharArray();
     char[] n = t.toCharArray();
     Arrays.sort(c);
     Arrays.sort(n);
     return Arrays.equals(c, n);    
    }
}
