public class PrimeNumber {
    public static void main(String[] args) {
        int i=1;
        int x = 31;
        double y = Math.sqrt(x);
        int n = (int)y;

        if(x == 1 || x == 2 || x==3){
            prime();
        }else if(x % 2 == 0 || x % 3 == 0){
            notPrime();
        }else {
            while( 6*i <= n){
                if(x % (6*i-1) == 0){
                    notPrime();
                }else if(x % (6*i+1) == 0){
                    notPrime();
                }
                i++ ;
            }
            prime();
        }


    }

    public static void prime() {
        System.out.println("Prime Number");
    }
    public static void notPrime() {
        System.out.println("Not a Prime Number");
    }
}
