package utilites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtiles {
	public static String getTimestamp() {
		return new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss").format(new Date());
		/*this class everytime giving me the current milisec,instead of writing this everywhere, As a single method in a class , where ever i want i can call this method*/
	}

}
