package palindrom;

import java.util.Scanner;

public class PalindromFinderRunner {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        PalindromFinder palindromFinder = new PalindromFinder();
        int N;
        System.out.println("Enter N (0<=N<=100)");
        try {
            N = Integer.parseInt(input.nextLine());
            if(N<0 || N >100){
                throw new Exception();
            }
        }
        catch (Exception ex ){
            System.out.println("Invalid input");
            input.close();
            return;
        }
        System.out.println("Palindroms:");
        System.out.println(palindromFinder.getPalindroms(N));
        input.close();
    }
}
