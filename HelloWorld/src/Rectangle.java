import java.util.Scanner;
public class Rectangle {
	
	private int length;
	private int breadth;
	public void setLength(int a) {
		length = a;
	}
	public void setBreadth(int a) {
		breadth = a;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle First = new Rectangle();
		Scanner reader = new Scanner(System.in);
		System.out.println("please enter the length");
		int i=reader.nextInt();
		First.setLength(i);
		System.out.print("the length is"+First.length);
		
		System.out.println("please enter the breadth");
		int j=reader.nextInt();
		First.setBreadth(j);
		System.out.print("the length is"+First.breadth);
		
		reader.close();
		}

}
