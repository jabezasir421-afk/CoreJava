package Fundamentals;



public class ConditionalStatements
{

    private Performance performance;
    private final int target=10000;
 void main() {

        int sales= Integer.parseInt(IO.readln("Enter the amount : "));

        int bonus= bonus(sales);

    }

    int bonus(int sales){

         int bonus = 0;
         if(sales>2*target){
             performance=Performance.Excelent;
             System.out.println(performance);
             bonus=1000;
         } else if (sales>=1.5*target) {
             performance=Performance.Great;
             bonus=500;

         } else if (sales>=target) {
             performance=Performance.Satisfacoty;
             System.out.println(performance);
             bonus=100;
         }else {
             System.out.println("You are fired");
         }

         return bonus;
    }


}
