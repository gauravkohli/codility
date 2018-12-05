public class MaxProfit {
    public static void main(String[] args) {
        int[]a  = new int[] {23171,21011,21123,21366,21013,21367};
        System.out.println(solution(a));
    }

    private static int solution(int[] a) {

        int min = 200000;
        int max_profit  = 0;
        int current_profit;

        for (int i = 0; i < a.length; i++) {
            if(a[i] < min){
                min = a[i];
            }

            current_profit = a[i]-min;
            if(current_profit >max_profit) {
                max_profit = current_profit;
            }

        }
        return  max_profit;


    }
}
