package wordsInText;

import java.util.Scanner;

public class WordsInTextRunner {

    public static void main(String[] args){
        WordsTextFinder wordsTextFinder = new WordsTextFinder();
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String word;

        System.out.println("Enter your text (enter s in void string to stop)");
        while (input.hasNextLine()){
            String buf = input.nextLine();
            if(buf.equals("s")){
                break;
            }
            sb.append(buf+"\n");
        }
        System.out.println("Enter the word");
        word = input.nextLine();
        System.out.println("Number of word: "+ wordsTextFinder.getCountWord(sb.toString(),word));

        input.close();
    }
}
