package Fundamentals;

public class StringsBuilderExample{

    void main() {

        StringBuilder builder = new StringBuilder("INVOICE\s");

      builder.append("Kingam\s");

      builder.append("Mingam \n");

        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        System.out.println("return length = "+builder.length());

        System.out.println(

                builder.repeat(builder,3)
                /*
                repeat method is used for its name ad the parameters are "htw word" and no of times
                */
        );





    }
}
