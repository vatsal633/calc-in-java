import java.util.Scanner;

class first{
	public static void main(String args[])
	{
		int n1,n2,result;
		Scanner sc = new Scanner(System.in);
		
		char operator;

		System.out.println("choose the operator +,-,/,*");
		operator = sc.next().charAt(0);
		
		System.out.println("enter the first number:");
		n1 = sc.nextInt();
		+
		
		System.out.println("enter the second number:");
		n2 = sc.nextInt();
		
		switch(operator)
		{
			case '+':
			result = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + result);
			break;
			
			case '-':
			int result2  = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + result2);
			break;
			
			case '/':
			int result3 = n2 / n2;
			System.out.println(n1 + " / " + n2 + " = " + result3);
			break;
			
			case '*':
			int result4 = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + result4);
			break;
		}
	}
	
}
