/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int start = 1;
        int end = n;
        
        while (true) {
            
            int current = start + (end - start) / 2;
            int mid = guess(current);

            if (mid == 0) {
                return current;
            }
            else if ( mid == 1) {
                start = current + 1;
            }
            else if (mid == -1) {
                end = current - 1;
            }
        }
    }
}