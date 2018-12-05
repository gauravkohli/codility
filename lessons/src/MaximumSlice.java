import java.util.HashMap;
import java.util.Map;

public class MaximumSlice {
    public static void main(String[] args) {
        int[] a = new int[] {3 ,2, -6, 4, 0 };
        System.out.println(solutionb(a));
    }



    public static int solutionb(int[] a) {
        int max_sum =Integer.MIN_VALUE , max_ending=0;

        for (int i = 0; i < a.length; i++) {
           max_ending = Math.max(0, max_ending + a[i]);
           max_sum = Math.max(max_sum,max_ending);
        }

        return max_sum;
    }

//    public static int solution(int[] a) {
//        String hash, current_hash;
//        int prefixSum;
//        int max_sum = Integer.MIN_VALUE;
//        int current_sum ;
//
//        Map<String,Integer> sum = new HashMap<>();
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i; j < a.length ; j++) {
//                prefixSum = 0;
//
//                hash = new StringBuffer().append(i).append(j-1).toString();
//                current_hash = new StringBuffer().append(i).append(j).toString();
//
//
//                if(sum.containsKey(hash)){
//                    prefixSum = sum.get(hash);
//                }
//                current_sum = prefixSum + a[j];
//
//                sum.put(current_hash, current_sum);
//                if(current_sum>max_sum) {
//                    max_sum = current_sum;
//                }
//            }
//
//        }
//
//    }
}
