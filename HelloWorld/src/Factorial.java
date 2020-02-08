import java.util.Scanner;

public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	public static void main(String[] args) {
		System.out.println("enter the number of your choice");
		Factorial fc = new Factorial();
		fc.function(fc.num);
		
	}
	
	public void function(int a) {
		
		
		//Factorial fc = new Factorial();
		int total = 1;
		for(int i=a; i>0; i--) {
			total = total*i;
			
		}
		System.out.println("the factorial of given number is"+total);
	}

}
