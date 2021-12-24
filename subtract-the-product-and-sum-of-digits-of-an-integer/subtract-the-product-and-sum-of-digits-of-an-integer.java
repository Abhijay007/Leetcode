class Solution {
    public int subtractProductAndSum(int n) {
        int ans = 0;
        int sum = 0;
        int pro = 1;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem;
            pro *= rem;
            ans = pro - sum;
        }
            return ans;
    }
}