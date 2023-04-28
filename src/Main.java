import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        //TO DO
//
//        for(int i = 0; 1 < args.length; i++){
//            System.out.println(args[1]);
//        }
        Geometry geometry = new Geometry();
        geometry.accessingPi();

        Scanner solve = new Scanner(System.in);

        try {
            System.out.println("enter length");
            float length__ = solve.nextFloat();

            float breath__ = solve.nextFloat();

            float name = geometry.areaOfRectangle(length__, breath__);
            System.out.println(name);
        }catch(Exception e) {
            System.out.println("enter the right input");
        }
//        }catch (InputMismatchException Exception ){
//            System.out.println("enter breath");
//        }

       // String num = 21;













    }
}
