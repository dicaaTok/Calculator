import java.util.Scanner;

public class Calculator {
    public static void main (String[] args ) {


    Scanner sc = new Scanner(System.in);
        System.out.printf("ведите число");
        float a = sc.nextFloat();
        System.out.printf("ведите опирацию (+,-,*,/)");
        char operation = sc.next().charAt(0);
        System.out.printf("ведите второе число");
        float b = sc.nextFloat();

        if (operation == '+') {
            float result = a + b;
            System.out.printf(a + "+" + b + "=" + result);
        } else if (operation == '-') {
            float result = a - b;
            System.out.printf(a + "-" + b + "=" + result);
        } else if (operation == '*') {
            float result = a * b;
            System.out.printf(a + "*" + b + "=" + result);
        } else if (operation == '/') {
            float result = a / b;
            System.out.printf(a + "/" + b + "=" + result);
        } else {
            System.out.printf("калкулятор не поерживет такую функцию");
        }

        }

    }
