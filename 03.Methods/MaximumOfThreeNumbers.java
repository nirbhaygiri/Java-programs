class MaximumOfThreeNumbers {
    static int max(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        System.out.println("Max = " + max(10, 25, 15));
    }
}
