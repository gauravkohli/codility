import java.util.Arrays;

public class Dominator {
    public static void main(String[] args) {
        int[] a = new int[]{};
        System.out.println(solution(a));
    }

    private static int solution(int[] A) {
        if(A.length == 0){
            return -1;
        }
        int[] copy = Arrays.copyOf(A, A.length);
        Arrays.sort(copy);
        int candidate = copy[copy.length/2];
        int count = 0;
        int index= -1;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == candidate){
                index = i;
                count++;
            }
        }

        if(count>A.length/2){
            return index;
        }else{
            return -1;
        }
    }
}

