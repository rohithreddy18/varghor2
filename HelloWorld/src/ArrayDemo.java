import java.util.*;
public class ArrayDemo {

	public ArrayDemo() {
		// TODO Auto-generated constructor stub
	}
	
	static String findNumber(List<Integer> arr, int k) {
		
		if(arr.contains(k)) {
			return "Yes";
			
		}
		else {
			return "No";
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		//ArrayDemo ad = new ArrayDemo();
		
		List<Integer> ab = new ArrayList<>();
		ab.add(2);
		ab.add(1);
		ab.add(3);
		ab.add(4);
		ab.add(1);
		ab.add(5);
		
		String next =findNumber(ab,2);
		System.out.println(next);
		
	}
}

	
