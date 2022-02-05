class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean check = false;
        for(char ch = 'a'; ch <= 'z'; ch++){
            boolean pangram = checkPanagram(ch,sentence);
            if(pangram == false){
             check = false;
             break;    
      }else{
        check = true;
   }
        }
    return check;
    }
 

    public boolean checkPanagram(char ch, String sentence){
        for(char c : sentence.toCharArray()){
            if(c == ch){
                return true;
            }
        }
        return false;
    }
}