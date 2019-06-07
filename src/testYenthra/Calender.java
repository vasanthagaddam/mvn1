package testYenthra;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Calender {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
	//	int year = ld.getYear();
		//Month month = ld.getMonth();
	//	int dayOfMonth = ld.getDayOfMonth();
	//	DayOfWeek dayOfWeek = ld.getDayOfWeek();
	System.out.println( ld.getYear());
	System.out.println(ld.getDayOfMonth());
	System.out.println( ld.getMonth());
	LocalDate plusDays = ld.plusMonths(24);
	System.out.println("******ADD MONTHS******"+plusDays);
	LocalDate minusMonths = ld.minusMonths(03);
	System.out.println("******MINUS MONTH*****"+minusMonths);
	//ld.plusDays(565);
	System.out.println(	"******ADD DAYS******"+ld.plusDays(565));
	System.out.println("-----MINUS DAYS-----"+ld.minusDays(463));
	
	}

}
