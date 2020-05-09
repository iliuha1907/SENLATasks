package palindrom;

import java.util.LinkedList;
import java.util.List;

public class PalindromFinder {

    public List<String> getPalindroms(int N){
        List<String> palindroms = new LinkedList<>();
        for(int i =0;i<N+1;i++){
            String number = Integer.toString(i);
            if(number.equals(new StringBuilder(number).reverse().toString())){
                palindroms.add(number);
            }
        }
        return palindroms;
    }
}
