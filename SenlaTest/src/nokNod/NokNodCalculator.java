package nokNod;

public class NokNodCalculator {

    public long getGCD(long a, long b){
        if (b==0){
            return a;
        }
        return getGCD(b,a%b);
    }

    public long getNOK(long a, long b){
        long nod = getGCD(a, b);
        return (a*b)/nod;
    }
}
