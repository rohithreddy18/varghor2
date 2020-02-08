
public class DesignDemo {

	public DesignDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public void display1() {
		
		for(int i=5;i>0;i--) {
			
			for(int j=5;j>=i;j--) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
	
public void display3() {
		
		for(int i=0;i<5;i++) {
			
			for(int j=5;j>i;j--) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
	
	
	public void display2() {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
	
	public void display4() {
		
		for(int i=5;i>0;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesignDemo d=new DesignDemo();
		d.display1();
		d.display2();
		d.display3();
		d.display4();
	}

}
