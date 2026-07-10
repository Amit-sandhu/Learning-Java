package arrays;


class UcampusClient{

    String name;
    String phone;
    int roll;
    String message;

    int GenerateOtp(){
        
        double x = Math.random();
        int otp = (int)(x*10000);     
        while(otp<1000){
            if(otp == 0){
                GenerateOtp();         // instead of random package
            }
            otp*=10;
        }
        return otp;
    }       
}

public class ArrayRef {
    public static void main(String[] args){
        UcampusClient[] client = new UcampusClient[50];
        for(int i = 0;i<client.length;i++){
            client[i] = new UcampusClient();
            System.out.println(client[i].GenerateOtp());
        }
    }
}
