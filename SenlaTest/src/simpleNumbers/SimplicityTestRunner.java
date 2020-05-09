package simpleNumbers;

import java.util.Scanner;

public class SimplicityTestRunner {

    public static void main(String[] args){
        SimplicityChecker simplicityChecker = new SimplicityChecker();
        EvenChecker evenChecker = new EvenChecker();
        Scanner input = new Scanner(System.in);
        int messageLength;
        long number;
        char what;
        String message;

        System.out.println("Enter 1 if you want to test a number for simplicity " +
                        "accurate and enter 2 if probabilistic");
        message = input.nextLine();
        messageLength = message.length();
        if(messageLength > 1 || messageLength == 0){
            System.out.println("Invalid input data");
            input.close();
            return;
        }
        what = message.charAt(0);
        if(what != '1' && what!='2'){
            System.out.println("Invalid input data");
            input.close();
            return;
        }

        System.out.println("Now enter your number");
        message = input.nextLine();
        try {
            number = Long.parseLong(message);
            if(number<1){
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println("Invalid input data");
            input.close();
            return;
        }

        switch (what){
            case '1':
                System.out.println("Your number is "
                        +(simplicityChecker.isSimple(number) ? "simple":"not simple") + " and "
                +(evenChecker.isEven(number) ? "even":"odd"));
                break;
            case '2':
                System.out.println("With high probability, your number is "+
                        (simplicityChecker.isProbableSimple(number) ? "simple":"not simple ") + " and "
                        +(evenChecker.isEven(number) ? "even":"odd"));

        }
        input.close();
    }
}
