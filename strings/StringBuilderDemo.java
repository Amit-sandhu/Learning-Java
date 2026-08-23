package strings;

public class StringBuilderDemo {
    public static void main(String[] args){

        // StringBuilder is mutable, unlike String, so it's much faster
        // when you need to build or edit text inside a loop.
        StringBuilder sb = new StringBuilder();

        for(int i = 1;i<=5;i++){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());

        sb.insert(0,"Numbers: ");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}

// Practice: Use StringBuilder to check whether a given word is a
// palindrome (reads the same forwards and backwards).
