import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final String hiddenWord = "java";
        final byte maximumAttemps = 5;
        byte attemps = 0;
        boolean matchWord = false;
        char[] matchingLetters = new char[hiddenWord.length()];

        for (int i = 0; i < matchingLetters.length; i++) {
            matchingLetters[i] = '_';
        }
        /* System.out.println(matchingLetters);
        System.out.println(hiddenWord); */

        while (!matchWord && attemps < maximumAttemps) {
            System.out.println("Reveal the hidden word: " + String.valueOf(matchingLetters) + " (" + hiddenWord.length() + " letters)");
            System.out.print("Please, enter a letter: ");

            char letter = Character.toLowerCase(sc.next().charAt(0));
            boolean matchingLetter = false;

            for (int i = 0; i < hiddenWord.length(); i++) {
                if (hiddenWord.charAt(i) == letter) {
                    matchingLetter = true;
                    matchingLetters[i] = letter;
                }
            }
            if (!matchingLetter) {
                attemps++;
                System.out.println("Sorry.  Remaining attemps: " + (maximumAttemps - attemps));
            }
            if (String.valueOf(matchingLetters).equals(hiddenWord)) {
                matchWord = true;
                System.out.println("Success!  Word: '" + hiddenWord + "' found.");
            }
        }

        if (!matchWord) {
            System.out.println("You lost, the hidden word was: " + hiddenWord);
            System.out.println("Game Over");
        }
        
        sc.close();
    }
}