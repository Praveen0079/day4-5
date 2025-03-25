public class RemoveDupl {
        // Method to remove duplicate characters from a string without
         public static String removeDuplicates(String str) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (sb.indexOf(String.valueOf(ch)) == -1) {
                    sb.append(ch);
                }
            }
            return sb.toString();
        }

        public static void main(String args[]) {
            String input = "hello";
            String result = removeDuplicates(input);
            System.out.println("String after removing duplicates: " + result);
        }
}