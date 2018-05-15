package cinema;

import java.util.Scanner;

public class OrderTicket {
	
	public int order(int in) {
		
		int input = 0;
		
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()){
			input = scanner.nextInt();
			in = in + input;}
		return in;
		}
	}