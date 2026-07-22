package bitwise;
import java.util.Stack;

public class makeBinary {
    public static void main(String[] args){
        int x = 89;
        int o = x;
        Stack<Integer> stack = new Stack<>();
        while(x>0){
            stack.add(x&1);
            x>>=1;
        }
        while (!stack.isEmpty()) {
            System.out.printf("%d", stack.pop());
        }

        System.out.println("\n");
        System.out.println(Integer.toBinaryString(o));
    }
}
