import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] A = new int[] {-1,-3};
        System.out.println(solution(A));
    }

    private static int solution(int[] A) {

        int[] counters = new int[1000001];

        for (int i = 0; i < A.length; i++) {
            if(A[i]>0){
                counters[A[i]] = 1;
            }
        }

        for (int i = 1; i < counters.length; i++) {
            if(counters[i] == 0){
                return i;
            }
        }
        return 0;
    }
}
