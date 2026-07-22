package bitwise;

public class nthBit {
    public static void main(String[] args){
        int x = 49;
        int y = 2;
        int z = 1;
        for(int i = 0;i<y;i++){
            z<<=1;
        }
        if((z&x) == 0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
        System.out.println(Integer.toBinaryString(x));

        // we created a number z = 1 and for y times (y == nth digit in the
        // binary number x) we left shift z by 1 bit and then we find the &
        // of z and x. if answer is 0 that means the nth bit must be zero then
        // only the whole answer became zero as all the other bits were already
        // set to 0 in z. if we get anything else that tells the nth bit was 1
    }
}
