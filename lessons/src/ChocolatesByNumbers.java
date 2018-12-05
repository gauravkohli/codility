public class ChocolatesByNumbers {
    public static void main(String[] args) {
        int N = 947853;
        int M = 4453;
        System.out.println(solution(N,M));
    }

    private static int solution(int N, int M) {

        return (int)(lcd(N,M)/M);

    }

    static int gcd(int N, int M){

        if(M==0){
            return N;
        }
        if(N>M){
            return gcd(M,N%M);
        }else{
            return gcd(N, M%N);
        }
    }

    static long lcd(int N, int M){
        return ((long)N*M)/gcd(N,M);
    }
}
