public class ranges {
    public static void main(String[] args){
        // find ranges of byte ,short ,int ,long
        int int_max_range =  Integer.MAX_VALUE;
        int int_min_range =  Integer.MIN_VALUE;
        System.out.println(int_max_range);
        System.out.println(int_min_range);

        short short_max_range =  Short.MAX_VALUE;
        short short_min_range =  Short.MIN_VALUE;
        System.out.println(short_max_range);
        System.out.println(short_min_range);

        long long_max_range =  Long.MAX_VALUE;
        long long_min_range =  Long.MIN_VALUE;
        System.out.println(long_max_range);
        System.out.println(long_min_range);

        byte byte_max_range =  Byte.MAX_VALUE;
        byte byte_min_range =  Byte.MIN_VALUE;
        System.out.println(byte_max_range);
        System.out.println(byte_min_range);

        float float_max_range =  Float.MAX_VALUE;
        float float_min_range =  Float.MIN_VALUE;
        System.out.println(float_max_range);
        System.out.println(float_min_range);

        double double_max_range =  Double.MAX_VALUE;
        double double_min_range =  Double.MIN_VALUE;
        System.out.println(double_max_range);
        System.out.println(double_min_range);

        char ch =  'a';                 // char is of 2 bytes as it stores ascii values
        System.out.println(ch);         // stores integer values only eg : 'a' = 97    
        char ch_ = 97;                  // char is an integer data type as it stores integer values and convert them to characters/ascii
        System.out.println(ch_);

        System.out.println(12.2>90.4);   
    }
}
