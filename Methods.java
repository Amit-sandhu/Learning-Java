public class Methods {
    static public void main(String[] args){
        String johnGrade = grading("John",15,70);
        System.out.println("You got a grade of "+johnGrade);
    }
    static public String grading(String name, int age,int marks){
        String grade; 
        if(marks >= 90){
            grade = "A+";
        }
        else if(marks>=80){
            grade = "A";
        }
        else{
            grade = "B";
        }
        System.out.println("Hello"+" "+name+" "+age+" "+"yo"+"\n");
        return (grade);
    }
}
