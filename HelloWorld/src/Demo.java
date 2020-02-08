import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		for(int i=5;i>0;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}
