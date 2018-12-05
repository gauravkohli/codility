public class Necklace {
    public static void main(String[] args) {
        int[] A = new int[]{5,4,0,3,1,6,2,7,8};
        System.out.println(solution(A));
    }

    private static int solution(int[] A) {
        int[] temp = new int [1000000];

        int next_position = 0;
        int necklace_number =1;
        int necklace_max = 0;

        int current_length = 0;

        int all_parsed = 0;
        int current = next_position;

        while(temp[current] !=0 || all_parsed<A.length) {

            temp[current] = necklace_number;
            current_length++;
            current = A[current];

            if(current_length>necklace_max ){
                necklace_max = current_length;
            }

            if(temp[current] !=0){
                necklace_number++;
                current = ++next_position;
                current_length = 0;
                all_parsed++;
                continue;
            }

            all_parsed++;

        }

        return necklace_max;
    }
}
