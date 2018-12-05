import java.util.EmptyStackException;
import java.util.Stack;

public class Brackets1 {
    public static void main(String[] args) {


    }

    protected static int solution(String S) {

        int length = S.length();
        Stack<Character> stack = new Stack<>();
        char current;

        Character pop;
        try {
            for(int i=0; i < length; i++ ){
                current = S.charAt(i);
                switch (current){
                    case '(':
                    case '{':
                    case '[':
                        stack.push(current);
                        break;
                    case ')':
                        pop = stack.pop();
                        if(!pop.equals('(')){
                            return  0;
                        }
                        break;

                    case '}':
                        pop = stack.pop();
                        if(!pop.equals('{')){
                            return  0;
                        }
                        break;

                    case ']':
                        pop = stack.pop();
                        if(!pop.equals('[')){
                            return  0;
                        }
                        break;
                }

            }
        } catch (EmptyStackException e) {
            return  0;
        }

        if(!stack.isEmpty()){
            return 0;
        }
        return 1;

    }

}
