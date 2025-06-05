class Solution {
    public int reverse(int x) {
        int reversedSum = 0;
        while (x != 0) {
            int lastDigit = x % 10;

            if (reversedSum > Integer.MAX_VALUE / 10 || (reversedSum == Integer.MAX_VALUE / 10 && lastDigit > 7)) return 0; 
            if (reversedSum < Integer.MIN_VALUE / 10 || (reversedSum == Integer.MIN_VALUE / 10 && lastDigit < -8)) return 0; 

            reversedSum = reversedSum * 10 + lastDigit;
            x /= 10;
        }
        return reversedSum; 
    }
}