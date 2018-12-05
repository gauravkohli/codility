public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = new int[]{2,3,1,5};
        System.out.println(solution(A));
    }

    private static int solution(int[] A) {
        int [] temp = new int[A.length+2];

        for (int i = 0; i < A.length; i++) {
            temp[A[i]] = 1;
        }
        for (int i = 1; i < temp.length; i++) {
            if(temp[i] == 0) {
                return i;
            }
        }

        return 0;
    }
}
