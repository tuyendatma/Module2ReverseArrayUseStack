import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arrBefore = {1,2,3,4,5};
        int[] arrAfter =new int[5];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <arrAfter.length ; i++) {
            stack.push(arrBefore[i]);
        }
        int i=0;
        while (!stack.empty()){
            arrAfter[i] = stack.pop();
            i++;
        }
        System.out.println(Arrays.toString(arrBefore));
        System.out.println(Arrays.toString(arrAfter));
    }
}
