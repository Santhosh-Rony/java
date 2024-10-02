import java.util.Scanner;

class MoveAllLettersToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("enter a letter");
        char letter = scanner.next().charAt(0);
        // Count the number of "a" letters in the word
        int aCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                aCount++;
            }
        }

        if (aCount == 0) {
            // The word does not contain any "a" letters
            System.out.println("The word does not contain any 'a' letters.");
        } else {
            // Move all "a" letters to the end of the word
            String newWord ="";
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != letter) {
                    newWord += word.charAt(i);
                    
                }
            }
            System.out.println(newWord);
            for (int i = 0; i < aCount; i++) {
                newWord += letter;
            }
            System.out.println("New word: " + newWord);
            scanner.close();
        }
    }
}