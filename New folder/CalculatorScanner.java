import java.util.Scanner;

public class CalculatorScanner {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no ");
        int a = sc.nextInt();

        System.out.println("Enter second no ");
        int b = sc.nextInt();

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
