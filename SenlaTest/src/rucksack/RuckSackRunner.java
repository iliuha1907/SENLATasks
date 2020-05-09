package rucksack;

public class RuckSackRunner {

    public static void main(String[] args){
        RuckSackAggregator ruckSackAggregator = new RuckSackAggregator();
        int[] weights = {10,5,1,21,19};
        int[] costs = {25, 27, 31, 14, 28};
        int sum = ruckSackAggregator.getValue(weights,costs,20);
        if(sum == -1){
            System.out.println("Invalid input data");
            return;
        }
        System.out.println("Max possible sum of elements: "+
                sum);
    }
}
