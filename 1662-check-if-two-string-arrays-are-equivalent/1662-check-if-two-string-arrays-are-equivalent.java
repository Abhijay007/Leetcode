class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String S1="";
        String S2="";
        for(String finalString: word1){
            S1+=finalString;
        }
        for(String finalString: word2){
            S2+=finalString;
        }
        if(S1.equals(S2)){
             return true;
        }
        return false;
    }
}