import java.util.Stack;

public class Nesting {

    public static void main(String[] args) {

        System.out.println(solution("()(()()(((()())(()()))"));
    }

    protected static int solution(String S){

        if(S.length() == 0){
            return 1;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            Character current=S.charAt(i);
            switch (current){
                case '(':
                    stack.push(current);
                    break;
                case ')':
                    if(!stack.isEmpty()){
                        Character pop = stack.pop();
                        if(!pop.equals('(')) {
                            return 0;
                        }
                    }else{
                        return 0;
                    }
                }
        }

        if(stack.size() == 0){
            return 1;

        }


        return  0;
    }
}


