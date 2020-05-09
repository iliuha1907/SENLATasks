package wordsInText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsTextFinder {

    public int getCountWord(String text, String word) {
        Pattern pattern = Pattern.compile(word,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        int count =0;
        while (matcher.find()) {
            int before = matcher.start()-1;
            int after = matcher.end();
            if(before>0){
                char symb = text.charAt(before);
                if(Character.isLetter(symb) || (symb<='9'&& symb>='0')){
                   continue;
                }
            }
            if(after<text.length()){
                char symb = text.charAt(after);
                if(Character.isLetter(text.charAt(after)) || (symb<='9'&& symb>='0')){
                    continue;
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        String text = "привет, -9привет Abcdпривет привет приве8т";
        System.out.println(new WordsTextFinder().getCountWord(text,"привет"));
    }
}
