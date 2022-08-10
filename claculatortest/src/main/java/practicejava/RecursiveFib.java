package practicejava;

public class RecursiveFib {
    public static void main(String args[]){
        System.out.println(myFib(10));

    }
    public static int myFib(int n){
        if(n<=1){
            return n;
        }
        else{
            return  myFib(n-1)+myFib(n-2);
        }
    }
}
