import java.util.Stack;

public class Fish {
    public static void main(String[] args) {

        int[] a = new int[] {4,3,2,1,5};
        int[] b = new int[] {1,1,0,0,0};
//        0 1 0 0
//        1 0 0 0
//        1 1 0 0


        System.out.println(solution(a,b));
    }

    private static int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length; ) {

            if(B[i] == 1){


            }else{

            }




        }
        return stack.size();
    }




}
