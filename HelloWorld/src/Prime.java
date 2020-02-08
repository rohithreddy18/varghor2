import java.util.Scanner;

public class Prime {
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();


	public static void main(String[] args) {
		
		System.out.println("enter the numbers");
		Prime p = new Prime();
		
		System.out.println("The prime numbers between"+p.a+"and"+p.b);
		//System.out.println();
		for(int i = p.a;i<=p.b;i++) {
			int count = 0;
			//int num=i;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count = count+1;
					}
				}
			if(count==2) {
				System.out.println(i);
			}
		
	}
}
}

