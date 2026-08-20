package Fundamentals;

import java.util.Scanner;

public class ConditionalOperator {

     void main() {

        Scanner sc = new Scanner(System.in);
        int x =3,
                y=7;

        System.out.println(x<y?x:y);

        System.out.print("Enter Your Age = ");
        int age= sc.nextInt();

        String result = checkMinor(age);
        System.out.println(result);


    }

    public String checkMinor(int age){

        String result= age<=18?"minor":"Major";

       return result;


    }


}
