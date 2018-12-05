public class CountDiv {
    public static void main(String[] args) {
        int A = 7,B=7,K=5;
        System.out.println(solution(A,B,K));
    }

    private static int solution(int A, int B, int K) {

        if(A==B && A%K ==0 ){
            return 1;
        }

        int first, last;

        if(A%K==0){
            first = A/K;
        }else{
            first = A/K+1;
        }


        last = B/K;



        return last-first+1;
    }
}
