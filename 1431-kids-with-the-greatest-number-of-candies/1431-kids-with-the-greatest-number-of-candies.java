class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<>();
        for(int i = 0; i < candies.length;i++){
            boolean check = false;
        for(int j = 0; j< candies.length;j++){
           if(candies[i] + extraCandies < candies[j]){
           check = true;
           break;
        }
       }if(check){
         arr.add(false);
      }else{
        arr.add(true);
    }
        }
return arr;
    }
}