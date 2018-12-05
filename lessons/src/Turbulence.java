public class Turbulence {
    public static void main(String[] args) {
        int[]A = new int [] {100,50,100,50,100,50};
        System.out.println(solution(A));
    }

    private static int solution(int[] A) {

        if(A.length == 1 ){
            return  1;
        }
        int max_turbulence = 0;
        int current_turbulence = 0 ;
        int prev_direction = 0;
        int direction;
        for (int i = 0; i < A.length-1; i++) {
            direction = Integer.signum(A[i+1]-A[i]);
            if(direction == 0){
                current_turbulence = 0;
            } else if (prev_direction == direction){
                current_turbulence = 1;
            }else if(direction != prev_direction){
                current_turbulence ++;
            }
            if(current_turbulence>max_turbulence){
                max_turbulence= current_turbulence;
            }
            prev_direction = direction;
        }
        return max_turbulence+1;
    }
}
