package simpleNumbers;

public class SimplicityChecker {

    private int timesForTest = 100;
    public boolean isSimple(long number){
        for (long i=2;i*i<=number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public boolean isProbableSimple(long number){
        if(number%2 == 0 && number > 2 ){
            return false;
        }
        for(int i=0;i<timesForTest;i++){
            long a=(long)((Math.random()*(number-2))+1);
            if(gcd(number,a)!=1){
                return false;
            }
            long degValue=powMod(a,(number-1)/2,number);
            long jak=jak(a,number);
            if(degValue!=jak){
                if(degValue-number!=jak) {
                    return false;
                }
            }
        }
        return true;
    }

    private long jak(long a, long b) {
        if (a < 0) {
            return (long) Math.pow(-1, (b - 1) / 2) * jak(-a, b);
        }
        if (a % 2 == 0) {
            return (long) Math.pow(-1, (b * b - 1) / 8) * jak(a / 2, b);
        }
        if (a == 1) {
            return 1;
        }
        if (a < b) {
            long deg = ((a - 1) / 2) * ((b - 1) / 2);
            return (long) Math.pow(-1, deg) * jak(b, a);
        }
        return jak(a % b, b);
    }

    private long powMod(long x, long y, long m){
        if(y==0){
            return 1%m;
        }
        if(y%2!=0){
            return (x*powMod(x,y-1,m))%m;
        }
        else {
            return powMod((x * x)%m, y / 2,m);

        }
    }

    private long gcd(long a, long b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }

}
