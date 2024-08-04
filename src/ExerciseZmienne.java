import java.util.Random;

public class ExerciseZmienne {

    public static void main(String[] args) {
        Random randomNumbers = new Random();

        int x = 72;
        int y = 96;
        boolean result;
        int sum = x *y;

        System.out.println(x);
        System.out.println(y);

        result = x > y;
        System.out.println("x > y " + result);

        result = (x * 2) > y;
        System.out.println("x * 2  > y " + result);

         result = y < (x+3) && x > (x -2);
        System.out.println("y < (x+3) && x > (x -2)" + result);


        System.out.println(sum);
        result = (sum % 2) == 0;

        System.out.println("modulo " +result);


    }

}
