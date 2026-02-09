import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        
        

        int a = 2;
        int b = 5;

        Calculator cal = new Calculator();
        cal.add(a, b);        cal.sub(a, b);
        cal.mul(a, b);
        cal.div(a, b);

    }

    void add(int a, int b) {
        int c = a + b;
       System.out.println("The addition of " + a + " and " + b + " = " + c);
    }

    void sub(int a, int b) {
        int c = a - b;
       System.out.println("The subtraction of " + a + " and " + b + " = " + c);
    }

    void mul(int a, int b) {
        int c = a * b;
       System.out.println("The multiplication of " + a + " and " + b + " = " + c);
    }

    void div(int a, int b) {
        int c = a + b;
       System.out.println("The divivsion of " + a + " and " + b + " = " + c);
    }
}
