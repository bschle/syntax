public class StringExtensions {
    private static String theText;
    private static String thequersum;
    private static int number;
    public static void main(String[] args) {
        String text = "Hallo Welt!";
        System.out.println("reversed: " + reverse(text));

        String zahl = "12345";
        System.out.println(quersum(zahl)); // Quersumme
    }

    static String reverse(String text) {
        theText = "";
        for (int i = text.length()-1; i > 0; i--) {
            theText += text.charAt(i);
        }
        return theText; // TODO
    }

    static int quersum(String value) {
        thequersum = "";
        String quersum = "";
        for (int i = 0; i < value.length(); i++) {
            quersum += value.charAt(i);
            int sum = Integer.parseInt(quersum);
            number += sum;
            quersum = "";
        }
        return number; // TODO
    }
}
