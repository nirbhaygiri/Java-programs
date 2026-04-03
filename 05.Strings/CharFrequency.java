public class CharFrequency {

    public static void frequency(String str) {

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;

            if (ch == ' ') continue;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (str.indexOf(ch) == i) {
                System.out.println(ch + " : " + count);
            }
        }
    }

    public static void main(String[] args) {
        frequency("banana");
    }
}