import java.util.Scanner;

public class fibonacci {

	public fibonacci() {
		// TODO Auto-generated constructor stub
	}
	
	Scanner sc = new Scanner(System.in);
	
	int a =sc.nextInt();
	int b =sc.nextInt();
	int len = sc.nextInt();
	
	public static void main(String[] args) {
		
		System.out.println("enter the first two numbers and series length respectively");
		fibonacci f = new fibonacci();
		int temp1=f.a;
		int temp2=f.b;
		System.out.println("Fibonacci series%n"+f.a+"%n"+f.b);
		for(int i=0;i<f.len;i++) {
			
			int j=temp1+temp2;
			System.out.println(j);
			
			temp1= temp2;
			temp2= j;
			
			
		}
		
	}

}
