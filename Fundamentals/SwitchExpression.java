package Fundamentals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchExpression {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month = ");
        int month = sc.nextInt();

     String season =   findSeason(month);

        System.out.println(season);



        IO.println("Ahoy\u0000");



    }

    public String findSeason(int month){
       return switch(month){
            case 1,12,11,10,2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9 -> "Autumn";
            default -> "invalid month";

        };
    }
}
