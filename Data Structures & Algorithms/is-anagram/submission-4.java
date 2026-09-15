class Solution {
    public boolean isAnagram(String s, String t) {
     boolean flag = false;
     int[] arr = new int[26];
     if(s.length()!=t.length()){
        return flag;
     }
     for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
        arr[t.charAt(i)-'a']--;
     }
     for(int i: arr){
        if(i!=0){
            return false;
        }
     }
     return true;   
    }
}
