public class test {
    
    int age;
    String name = "abc";
    int marks;
    static String college="asdd";
    // test(int age,String name,int marks){
        
    // }
    
    static public void main(String[] args){
        System.out.println(test.college);
        test s1 = new test();
        s1.name = "bob";
        System.out.println(s1.college);
        // System.out.println(test.name);
        System.out.println(test.college);
    }
}
