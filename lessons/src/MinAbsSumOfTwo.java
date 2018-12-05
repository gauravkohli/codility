import java.util.Arrays;

public class MinAbsSumOfTwo {
    public static void main(String[] args) {
        int[]A = new int[]{-1,-9};
        System.out.println(solution(A));
    }

    private static int solution(int[] A) {

        int min_sum = Integer.MAX_VALUE;
        Arrays.sort(A);

        // all negative
        if(A[0]< 0 && A[A.length-1]< 0){
            min_sum = Math.abs(A[A.length-1] * 2);

        } // negative + positive
        else if (A[0]< 0 && A[A.length-1]> 0 ){
            int largest_pos = A[A.length-1];
            int small_neg = A[0];
            int small_pos =0;

            int largest_neg = 0;

            for (int i = 0; i < A.length-1; i++) {
                if(A[i] < 0 & A[i+1]>= 0){
                    largest_neg = A[i];
                    small_pos  = A[i+1];

                }
            }

            int sum;

            System.out.println(largest_pos);
            System.out.println(small_pos);
            System.out.println(largest_neg);
            System.out.println(small_neg);
            int[] temp = new int[]{small_pos, largest_pos, small_neg, largest_neg};
            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp.length; j++) {
                    sum = Math.abs(temp[i] + temp[j]);
                    if(sum < min_sum){
                        min_sum = sum;
                    }

                }

            }




        } // all positive
        else {
            min_sum =  A[0]*2;
        }


//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < A.length; j++) {
//                sum = Math.abs(A[i] + A[j]);
//                if(sum < min_sum){
//                    min_sum = sum;
//                }
//
//            }
//
//        }
        return min_sum;
    }
}
