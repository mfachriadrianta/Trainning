package www.mfachriadrianta.com;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//        int a = 115;
//
//        long a_long = a;
//        System.out.println(a_long);
//
//        byte a_byte = (byte) a;
//        System.out.println(a_byte);
//
//        float b_float = 2;
//
//        float resultValue = a + b_float;
//        System.out.printf("%d + %f = %f\n", a,b_float,resultValue);
//
//        String c_string = "Value";
//        System.out.printf("%s = %f" , c_string, resultValue);

//       int a = 1;
//       System.out.printf("%d to %d", a, +a);
//
//        int b = 0;
//        for(int i = 0; i <= 9; i++){
//            b++;
//        }
//        System.out.printf("%d", b);

//        boolean next = true;
////        while(next){
////        }

        // Operator unary
//        int a = 1;
//        System.out.printf("%d = %d",a,-a);

//        Integer a = 3;
//        --a;
//        System.out.printf("%d = %d", a, a);

        // While
        Scanner input = new Scanner(System.in);
        Integer inputUser = input.nextInt();
        String a;
        a = "fachri";
        System.out.println("What do you want to enter?" + inputUser);
        while (inputUser == 1){
            System.out.println(a);
        }
    }
}
