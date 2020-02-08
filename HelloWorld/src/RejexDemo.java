import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RejexDemo {

	public RejexDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws Throwable {
		/*String test = "software"; 
		  
	   String seq = "soft"; 
	   boolean b = test.contains(seq); 
	    if(b) {
	    	System.out.println("the word is found");
	    }
	    System.out.println("JaVaTpoInt".toLowerCase());*/

	    /*String sDate4 = "Thu, Dec 31 1998";
	   SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
	    SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");
	    Date date1= formatter4.parse(sDate4);
	    System.out.println(date1);
	    System.out.println(formatter1.format(date1));*/
		
		String sDate4 = "Thu, Feb 31 1998";
		SimpleDateFormat sdf=new SimpleDateFormat("E, MMM dd yyyy");
		sdf.setLenient(false);
		Date date1= sdf.parse(sDate4);
		System.out.println(date1);
		
}
}