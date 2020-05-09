package wordsSentenceCount;

import java.util.Scanner;

public class WordsCounterRunner {

    public static void main(String[] args){
        WordsCounter wordsCounter = new WordsCounter();
        System.out.println("Enter your sentence");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] words = wordsCounter.getWords(sentence);
        System.out.println("Number of words: "+ words.length);
        System.out.println("Words: ");
        for(int i =0;i<words.length;i++){
            System.out.println(words[i]);
        }
        input.close();
    }
}
