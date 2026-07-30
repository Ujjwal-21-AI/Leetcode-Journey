class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int dup = x;
        long revN = 0;

        while (x > 0) {
            int ld = x % 10;
            revN = revN * 10 + ld;
            x /= 10;
        }

        return dup == revN;
    }
}