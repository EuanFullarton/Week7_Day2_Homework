package example.codeclan.com.wordcounter;

/**
 * Created by user on 18/04/2017.
 */

public class WordCount {

    public static int countWords(String input){
        int numberOfWords = 0;

        boolean isWord = false;
        int endOfLine = input.length() - 1;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)) && i != endOfLine) {
                isWord = true;
            }
            else if (!Character.isLetter(input.charAt(i)) && isWord) {
                numberOfWords++;
                isWord = false;
            }
            else if (Character.isLetter(input.charAt(i)) && i == endOfLine) {
                numberOfWords++;
            }
        }
        return numberOfWords;
    }

}


