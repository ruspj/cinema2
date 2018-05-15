package cinema;
public class TicketSales {
		public static void main(String args[]) {

			int Standard = 0;
			int OAP = 0;
			int Student = 0;
			int Child = 0;
			int total = 0;
					
			int choice = 0;
			int input = 0;
			
			 discounts offer = new  discounts();
			 
			 int Standardprice = offer.offer("Standardprice");	
			 int OAPprice = offer.offer("OAPprice");	
			 int Studentprice = offer.offer("Studentprice");	
			 int Childprice = offer.offer("Childprice");	
			
			while (choice >= 0  && choice <= 4)
			{
				System.out.println("Ordered");
				System.out.println(Standard +" x Standard £"+ Standardprice +" each    " +
				OAP +" x OAP £"+ OAPprice +" each    " +
				Student +" x Student £"+ Studentprice +" each    " +
				Child +" x Child £"+ Childprice +" each    ");
				
				output out = new output();	
				out.menu();	
				
				
				OrderTicket order = new OrderTicket();
				
				choice = order.order(0);
		
				if (choice == 1) {
					System.out.println("how many Standard tickets?");
					Standard = order.order(Standard);
					}
				if (choice == 2) {
					System.out.println("how many OAP tickets?");
					OAP = order.order(OAP);
					}
				if (choice == 3) {
					System.out.println("how many Student tickets?");
					Student = order.order(Student);
					}
				if (choice == 4) {
					System.out.println("how many Child tickets?");
					Child = order.order(Child);
					}	
				}
			
			
			// output calculation & total
			output out = new output();	
			out.total(Standard, Standardprice, OAP, OAPprice, Child, Childprice, Student, Studentprice);		
			
			}/*end main*/
}







	/*
	 *  == if equals
	 *  != if not equal
	 * 
	 * Main
	   Ticket details
	   Offers
	   Output

	Ticket details
	   Input ticket details


	Offers
	   Calculate price
	   If Wednesday
	      Prices = -2 per ticket

	Calculate price
	   £8 per Standard
	   £6 per OAP
	   £6 per Student
	   £4 per Child

	Output
	   Qty Standard X £8 =
	   Qty OAP X £6 =
	   Qty Student X £6 =
	   Qty  Child X £4 =
	   Total =*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

