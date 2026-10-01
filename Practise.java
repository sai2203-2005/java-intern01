import java.util.Scanner;

public class Practise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Addition\n2.subtraction\n3.multiplication");
			System.out.println("4.Divison\n5.Modulus\n6.Exit");
			System.out.print("Enter Your choice : ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.print("Enter two numbers : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = a + b;
				System.out.println(c);
			} else if(ch == 2) {
				System.out.print("Enter two numbers : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = a - b;
				System.out.println(c);
			} else if(ch == 3) {
				System.out.print("Enter two numbers : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = a * b;
				System.out.println(c);
			} else if(ch == 4) {
				System.out.print("Enter two numbers : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				double c = (double)a / b;
				System.out.println(c);
			} else if(ch == 5) {
				System.out.print("Enter two numbers : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = a % b;
				System.out.println(c);
			} else if(ch == 6) {
				sc.close();
				return;
			} else {
				System.out.println("Enter correct choice");
			}
		}
	}
}
