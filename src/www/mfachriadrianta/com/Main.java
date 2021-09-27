package www.mfachriadrianta.com;

public class Main {
    public static void main(String[] args){

        int a = 115;

        long a_long = a;
        System.out.println(a_long);

        byte a_byte = (byte) a;
        System.out.println(a_byte);

        float b_float = 2;

        float resultValue = a + b_float;
        System.out.printf("%d + %f = %f\n", a,b_float,resultValue);

        String c_string = "Value";
        System.out.printf("%s = %f" , c_string, resultValue);

    }
}
