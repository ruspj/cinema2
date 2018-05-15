package cinema;

public class output {
	
	public void menu() {
		System.out.println("");
		System.out.println("Select a ticket type");
		System.out.println("1 = Standard tickets");
		System.out.println("2 = OAP tickets");
		System.out.println("3 = Student tickets");
		System.out.println("4 = Child tickets");
		System.out.println("5 = finished");
	}
	
	

	public void total(int Standard, int Standardprice,int OAP, int OAPprice,
			int Child, int Childprice, int Student, int Studentprice) {
		
	int total = 0;

	total = 
			(Standard * Standardprice)+
			(OAP * OAPprice)+
			(Student * Studentprice)+
			(Child * Childprice);	
	
	if (Standard >= 1)System.out.println(Standard +" x Standard tickets at £"+ Standardprice +" Each = £"+ Standard * Standardprice);	
	if (OAP >= 1)     System.out.println(OAP      +" x OAP tickets at £"     + OAPprice      +" Each = £"+ OAP * OAPprice);
	if (Student >= 1) System.out.println(Student  +" x Student tickets at £" + Studentprice  +" Each = £"+ Student * Studentprice);
	if (Child >= 1)   System.out.println(Child    +" x Child tickets at £"   + Childprice    +" Each = £"+ Child * Childprice);	
	
	System.out.println("Total price of tickets = £"+ total);
	
	}
}