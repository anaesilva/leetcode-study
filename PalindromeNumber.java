public class PalindromeNumber {
    /*
        Given an integer x, return true if x is a palindrome, and false otherwise.

        Example 1:

        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.
        Example 2:

        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        Example 3:

        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
        ], target = 6
        Saída: [0,1]
    */

    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x > 0) {
            for (int i = 0, j = String.valueOf(x).length() - 1; i < j; i++, j--) {
                System.out.println("i: " + i + " j: " + j);
                if (String.valueOf(x).charAt(i) != String.valueOf(x).charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121)); // true
        System.out.println(palindromeNumber.isPalindrome(-121)); // false
        System.out.println(palindromeNumber.isPalindrome(10)); // false
    }

}