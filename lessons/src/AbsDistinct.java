import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {
    public static void main(String[] args) {
        int[] A = new int[]{-5,-3,-1,0,3,6};
        System.out.println(solution(A));
    }


    private static int solution(int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(Math.abs(A[i]));
        }
        return set.size();
    }
}

