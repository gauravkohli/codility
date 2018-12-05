public class MinPerimeterRectangle {

    public static void main(String[] args) {
        int N =30;
        System.out.println(solution(N));
    }

    private static int solution(int N) {

        int min_perimeter =Integer.MAX_VALUE;
        int curr_perimter;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if(N%i ==0){
                curr_perimter = 2*(i + N/i);
                if(curr_perimter<min_perimeter){
                    min_perimeter = curr_perimter;
                }
            }

        }
        return min_perimeter;
    }
}
