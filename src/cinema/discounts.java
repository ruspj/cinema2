package cinema;
import java.util.Calendar;
public class discounts {
	public int offer(String ticket) {
	
		int Standardprice = 8;
		int OAPprice = 6;
		int Studentprice = 6;
		int Childprice = 4;
		int price = 0 ;
	
    	if (ticket == "Standard") price = Standardprice;
    	else if (ticket == "OAP") price = OAPprice;
    	else if (ticket == "Student") price = Studentprice;
    	else if (ticket == "Child") price = Childprice;
    	else price = 8;
		
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK); 	
		switch (day) {
	    case Calendar.WEDNESDAY:/*System.out.println("today is wednesday");*/
	    	price = price - 2;
	    case Calendar.FRIDAY:	/*System.out.println("today is friday");*/
	    	price = price * 10;
	    	}
		
		return price;
	}
	
	
	
}