package nokNod;

import java.util.Scanner;

public class NokNodRunner {

    public static void main(String[] args){
        NokNodCalculator nokNodCalculator = new NokNodCalculator();
        Scanner input = new Scanner(System.in);
        long a, b;
            System.out.println("Enter first number:");
            String messageA = input.nextLine();
            System.out.println("Enter second number:");
            String messageB = input.nextLine();
            try {
                a = Math.abs(Long.parseLong(messageA));
                b = Math.abs(Long.parseLong(messageB));
                if(a == 0 || b == 0){
                    throw new Exception();
                }
            }
            catch (Exception ex){
                System.out.println("Invalid input data");
                input.close();
                return;
            }
        System.out.println("Nod = "+nokNodCalculator.getGCD(a, b)
                +", NOK = "+nokNodCalculator.getNOK(a, b));
        input.close();
    }
}
