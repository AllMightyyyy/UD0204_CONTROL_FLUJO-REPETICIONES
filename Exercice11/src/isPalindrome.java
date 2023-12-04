public class isPalindrome extends App{
    
    isPalindrome(String word) {
        StringBuilder sbReversed = new StringBuilder();

        for (int i = word.length()-1; i >= 0; i--) {
            sbReversed.append(word.charAt(i));
        }

        System.out.println("Reversed word is : "+ sbReversed.toString());
        if(sbReversed.toString().equals(word)) {
            System.out.println("This word is a Palindrome");
        } else {
            System.out.println("This word is not a Palindrome");
        }

    }
    
}
