package Fundamentals;

public class AssignmentOperators {

    public static void main(String[] args) {
        int x = 0;

        for(int i = 1;i<80;i++){
            IO.print(x);
            IO.print("+"+i+"=");
           x +=i;
            System.out.println(x);
        }
        
    }
    
}
