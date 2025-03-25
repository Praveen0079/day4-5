public class ReverseString {

        // Method to reverse a string using StringBuilder
        public static String reverseString(String str) {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        }

        public static void main(String args[]) {
            String input = "hello";
            String reversed = reverseString(input);
            System.out.println("Reversed string: " + reversed);
        }
}
//Reversed string: olleh