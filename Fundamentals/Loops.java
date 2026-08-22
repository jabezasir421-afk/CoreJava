package Fundamentals;

public class Loops {


    double balance = 10000;
    int intrestrate=100;

    void main(String[] args){



        int payment =Integer.parseInt(IO.readln("Enter the monthly payment amount : "));
        int goal=Integer.parseInt(IO.readln("Enter the amount you want to acheive  :  "));

        int years =yearsUsingDouble(payment,goal);

                IO.println("years :"+years);

    }

    int yearsForRetirement(int payment,int goal){

        int years = 0;
        while(balance<goal){

            balance += payment;

            double intrest= balance*intrestrate/100;
            balance +=intrest;
            years++;

        }
        return years;
    }

    int yearsUsingDouble(int payment,int goal){

        int years = 0;

        if(payment ==0||goal==0)
            return 0;

        do{
            balance += payment;
            double intrest=balance*intrestrate/100;
            balance += intrest;
            years++;
        }while (balance<goal);

        return years;
    }

}
