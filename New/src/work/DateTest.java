package work;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class DateTest extends DateValidator{
	
	@Test
	public void checkDate() {
		boolean b=isThisDateValid(null, "dd/MM/yyyy");
		assertFalse(b);
	}
	

}
