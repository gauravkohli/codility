public class CountFactors {
    public static void main(String[] args) {
        int N =9;
        System.out.println(solution(N));
    }

    private static int solution(int N) {

        int factors =0;
        int i;
        for (i = 1; i < Math.sqrt(N); i++) {
            if(N%i ==0){
                factors+=2;
            }

        }
        if(i*i==N){
            factors++;
        }


        return factors;
    }
}


