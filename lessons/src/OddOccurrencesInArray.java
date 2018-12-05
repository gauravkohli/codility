
import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int [] A = new int[]{9,3,9,3,7};
        System.out.println(solution(A));
    }

    private static int solution(int[] A) {


        Set<Integer> temp = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
           if(temp.contains(A[i])){
               temp.remove(A[i]);
           }else{
               temp.add(A[i]);
           }
        }


        return temp.iterator().next();
    }
}
