class Solution {
    public String largestOddNumber(String num) {
       int n = num.length();
        
        // Scan from the rightmost character backwards
        for (int i = n - 1; i >= 0; i--) {
            char digit = num.charAt(i);
            
            // Check if this digit is odd
            if ((digit - '0') % 2 != 0) {
                // Found the rightmost odd digit — return substring up to here
                return num.substring(0, i + 1);
            }
        }
        
        // No odd digit found anywhere
        return "";

    }
}