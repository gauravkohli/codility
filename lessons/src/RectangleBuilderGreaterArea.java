import java.util.*;

public class RectangleBuilderGreaterArea {

    public static void main(String[] args) {
        int[]A = new int[] {1,2,5,1,1,2,3,5,1};
        int X = 5;
        System.out.println(solution(A,X));
    }

    private static int solution(int[] A, int X) {

        Map<Integer, Integer> pens = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if(pens.get(A[i]) == null){
                pens.put(A[i],1);
            }else{
                pens.put(A[i],pens.get(A[i])+1);
            }
        }


        Iterator<Map.Entry<Integer, Integer>> iterator = pens.entrySet().iterator();


        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            if(next.getValue() ==1){
                iterator.remove();
            }
        }

        Integer[] objects = (Integer[]) pens.keySet().toArray();

        Arrays.sort(objects);

        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < objects.length; j++) {
//                if(objects)

            }
        }


        return 0;
    }
}
