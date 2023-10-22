import java.util.Scanner;

public class WhiteSpaceCleaner
{
    public static void main(String[] args) {
        // Starting scanner object, asking for input.
        System.out.println("Type a text to be cleaned from all white spaces");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String cleanText = "";

        // Iterate over text length.
        for (int i = 0; i < inputText.length(); i++) {
            char character = inputText.charAt(i);

            // Checks if character is a white space.
            if (!Character.isWhitespace(character)) {
                cleanText += character;
            }
        }
        System.out.println("Here's your text after cleaning :)");
        System.out.println(cleanText);
    }
}