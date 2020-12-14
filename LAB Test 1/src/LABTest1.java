import java.util.Scanner;

public class LABTest1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Question 1");
//Question 1
		System.out.print("Enter the number of items : ");
		int a = scan.nextInt();
		
		double b,c,d,totalp;
		double e,f,g,discount,ptopaid;
		
		if (a == 3) {
			System.out.print("Enter price for first item : RM");
			e = scan.nextDouble();
			System.out.print("Enter quantity for first item :");
			b = scan.nextInt();
			System.out.println();
			System.out.print("Enter price for second item : RM");
			f = scan.nextDouble();
			System.out.print("Enter quantity for second item :");
			c = scan.nextInt();
			System.out.println();
			System.out.print("Enter price for third item : RM");
			g = scan.nextDouble();
			System.out.print("Enter quantity for third item :");
			d = scan.nextInt();
			totalp = (e*b) + (f*c) + (g*d);
			if (totalp > 100) {
				discount = totalp*0.2;
				ptopaid = totalp*0.8;
				System.out.println();
				System.out.println("Total price : RM" + totalp);
				System.out.println("Discount received : RM" + discount);
				System.out.println("Price to be paid: RM" + ptopaid);
			}if (totalp <= 100) {
				discount = totalp*0.1;
				ptopaid = totalp*0.9;
				System.out.println();
				System.out.println("Total price : RM" + totalp);
				System.out.println("Discount received : RM" + discount);
				System.out.println("Price to be paid: RM" + ptopaid);
			}
		}
		
		if (a == 2) {
			System.out.print("Enter price for first item : RM");
			e = scan.nextDouble();
			System.out.print("Enter quantity for first item :");
			b = scan.nextInt();
			System.out.println();
			System.out.print("Enter price for second item : RM");
			f = scan.nextDouble();
			System.out.print("Enter quantity for second item :");
			c = scan.nextInt();
			System.out.println();
			System.out.print("Enter price for third item : RM");
			g = scan.nextDouble();
			System.out.print("Enter quantity for third item :");
			d = scan.nextInt();
			totalp = (e*b) + (f*c) + (g*d);
			if (totalp > 100) {
				discount = totalp*0.2;
				ptopaid = totalp*0.8;
				System.out.println();
				System.out.println("Total price : RM" + totalp);
				System.out.println("Discount received : RM" + discount);
				System.out.println("Price to be paid: RM" + ptopaid);
			}if (totalp <= 100) {
				discount = totalp*0.1;
				ptopaid = totalp*0.9;
				System.out.println();
				System.out.println("Total price : RM" + totalp);
				System.out.println("Discount received : RM" + discount);
				System.out.println("Price to be paid: RM" + ptopaid);
			}
		}
		
			if (a == 1) {
				System.out.print("Enter price for first item : RM");
				e = scan.nextDouble();
				System.out.print("Enter quantity for first item :");
				b = scan.nextInt();
				System.out.println();
				System.out.print("Enter price for second item : RM");
				f = scan.nextDouble();
				System.out.print("Enter quantity for second item :");
				c = scan.nextInt();
				System.out.println();
				System.out.print("Enter price for third item : RM");
				g = scan.nextDouble();
				System.out.print("Enter quantity for third item :");
				d = scan.nextInt();
				totalp = (e*b) + (f*c) + (g*d);
				if (totalp > 100) {
					discount = totalp*0.2;
					ptopaid = totalp*0.8;
					System.out.println();
					System.out.println("Total price : RM" + totalp);
					System.out.println("Discount received : RM" + discount);
					System.out.println("Price to be paid: RM" + ptopaid);
				}if (totalp <= 100) {
					discount = totalp*0.1;
					ptopaid = totalp*0.9;
					System.out.println();
					System.out.println("Total price : RM" + totalp);
					System.out.println("Discount received : RM" + discount);
					System.out.println("Price to be paid: RM" + ptopaid);
				}
			}

		System.out.println();
		System.out.println("Question 2");
//Question 2
		System.out.print("Enter sales : RM");
		double x;
		x = scan.nextDouble();
		if (x >= 150.00 && x <= 300.00) {
			System.out.print("Enter hours worked :");
			int hour;
			hour = scan.nextInt();
			double y;
			y = x*0.05;
			double z;
			z = y+(hour*5);
			System.out.println();
			System.out.println("Commission : RM" + y);
			System.out.println("Daily wage : RM" + z);
		}
		if (x >= 301.00 && x <= 500.00) {
			System.out.print("Enter hours worked :");
			int hour;
			hour=scan.nextInt();
			double y;
			y = x*0.10;
			double z;
			z = y+(hour*5);
			System.out.println();
			System.out.println("Commission : RM" + y);
			System.out.println("Daily wage : RM" + z);
		}
		if (x > 500.00) {
			System.out.print("Enter hours worked :");
			int hour;
			hour=scan.nextInt();
			double y;
			y = x*0.15;
			double z;
			z = y+(hour*5);
			System.out.println();
			System.out.println("Commission : RM" + y);
			System.out.println("Daily wage : RM" + z);
		}

	}

}
