import java.util.Stack;

public class StoneWall {

    public static void main(String[] args) {
        int[] a = new int[] {8,8,7,7,8,9,8,8,8,8};
        System.out.println(solution(a));
    }

    private static int solution(int[] a) {
        Stack<Integer> stack = new Stack<>();
        int count =0;

        for (int i = 0; i < a.length; i++) {
            if(stack.isEmpty()){
                stack.push(a[i]);
                count++;
            } else {
                if(stack.peek() == a[i]) {
                    continue;
                }
                if(stack.peek()> a[i]){

                    while(!stack.isEmpty() && stack.peek() > a[i]) {
                        stack.pop();
                    }
                    if(stack.isEmpty() || stack.peek() != a[i]){
                        stack.push(a[i]);
                        count ++;
                    }

                }else{
                    stack.push(a[i]);
                    count ++;
                }
            }



        }
        return  count;
    }
}
