package testjavaCode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class Sample {
	@Test
	public void test1() {
	
		DateFormat dateFormat = new SimpleDateFormat("dd mm yy");
		System.out.println(dateFormat);
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
	}

}
