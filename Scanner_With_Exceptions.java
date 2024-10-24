package auto_crashcourse12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_With_Exceptions {
public static void main(String[] args) {
	try {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("The value of "+a+" / "+b+" = "+(a/b));
	}
	catch (ArithmeticException x)
	{
		x.printStackTrace();
	}
	catch (InputMismatchException y)
	{
		y.printStackTrace();
	}
	System.out.println("after exception");
	System.out.println("last line");
}

}
