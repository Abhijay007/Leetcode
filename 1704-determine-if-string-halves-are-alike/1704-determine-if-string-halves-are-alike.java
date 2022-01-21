class Solution {
    public boolean halvesAreAlike(String s) {
          s = s.toLowerCase();
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);
        int a_count = countVowels(a);
        int b_count = countVowels(b);
        if(a_count == b_count){
            return true;
        }
        return false;
    }
    private static int countVowels(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
              || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
}