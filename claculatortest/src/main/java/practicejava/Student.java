package practicejava;

public class Student extends Person {

    public void message(){
        System.out.println("This is student class");
    }

    public void display() {
        message();
        super.message();
    }
}
