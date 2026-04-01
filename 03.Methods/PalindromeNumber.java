class PalindromeNumber {
    static boolean isPalindrome(int n) {
        int original = n, rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {
        if (isPalindrome(121))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
