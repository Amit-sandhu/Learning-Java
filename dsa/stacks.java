import java.util.Stack;
public class stacks {
     public static void main(String[] args){

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("GTAV");
        stack.push("Spiderman2");
        stack.push("RDR");

        System.out.println(stack);
        
        stack.pop();
        System.out.println(stack);

        System.out.println(stack.isEmpty());

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
     }   
}
