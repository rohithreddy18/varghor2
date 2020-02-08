import java.util.*;
public class OddArray {

	public OddArray() {
		// TODO Auto-generated constructor stub
	}
	
	
	static List<Integer> oddNumbers(int l, int r){
		if(r>l) {
			List<Integer> odd = new ArrayList<>();
			for(int i=l;i<=r;i++) {
				
				if(i%3==0) {
					odd.add(i);
				}
				
			}
			return odd;
		}
		
		else {
			System.out.println("Enter lower value as first input and Large Value as second");
			List<Integer> odd = new ArrayList<>();
			return odd;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		
		List<Integer> odd = oddNumbers(a,b);
		 Object[] Array1=odd.toArray();
		 for(int i=0;i<Array1.length;i++) {
			 System.out.println(Array1[i]);
		 }
		 
		 //for(Object ob:Array1) {
			// System.out.println(ob);
		 //}
	
			//System.out.println(Arrays.toString(odd.toArray()));
			
		
	}

}
