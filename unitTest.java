import org.junit.Test;
import static org.junit.Assert.*;

public class unitTest {

	//Question 1a. unit test how brid sing
    @Test
	public void testBirdSing(){
		Bird aBird= new Bird();	
	
		String resultStr = aBird.sing();
		assertEquals("I am singing", resultStr);
		
	}
}