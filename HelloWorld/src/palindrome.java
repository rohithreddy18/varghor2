
public class palindrome {

	public palindrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// Use scanner for getting number through input
		int temp;
		int rem,sum=0;
		int num = 454;
		
		int n=num;
		
		
		temp=num;
		while(num>0) {
			
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		if(temp==sum) {
			System.out.println(n+" "+"the given number is a palindrome");
		
		}
		
		else {
			System.out.println(n+" "+"the given number is not a palindrome");
		}
	}
	

}
