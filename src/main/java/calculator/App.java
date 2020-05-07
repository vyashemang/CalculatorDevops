package calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Calculator Program");
        Scanner scan = new Scanner(System.in);
        double num1, num2;
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        System.out.println(Add(num1, num2));
    }
    
    static double Add(double a, double b) {
    	return a + b;
    }
}
