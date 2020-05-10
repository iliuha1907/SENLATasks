package wordsSentenceCount;

import java.util.Arrays;
import java.util.Comparator;

public class WordsCounter {

    public String[] getWords(String sentence){
        String[] words = sentence.split("\\s+");
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  o1.compareTo(o2);
            }
        });
        for(int i=0;i<words.length;i++){
            words[i] = words[i].replaceFirst(Character.toString(words[i].charAt(0)),
                    Character.toString(words[i].charAt(0)).toUpperCase());
        }
        return words;
    }
}
