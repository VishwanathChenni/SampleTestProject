package practicejava;

public class PracticeJava extends Person {
    public void Sample(){
        System.out.println("From Child Class");
    }
    public static  void main(String args[]){
        Student student=new Student();
        student.display();
    }
}
