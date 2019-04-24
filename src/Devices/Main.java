package Devices;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Flat flat = new Flat();
		int choose;int hour;
		// creat offer 
		System.out.println("You have a flat in Lviv");
		System.out.println("You want to find out how many ๊ยา is used youre electronic devices");
		System.out.println("Press");
		System.out.println("1 - plug in microwave"		);
		System.out.println("2 - plug in computer" 		);
		System.out.println("3 - plug in lamp"			);
		System.out.println("4 - plug in boiler"			);
		System.out.println("5 - plug in refrigerator"	);
		System.out.println("6 - plug in Kettle"			);
		
		while(true) {
			System.out.print("Choose electronic device : ");choose=scan.nextInt();
			switch(choose) {
			
			case 1 :
				flat.plugInSocket(choose);
				break;
			case 2 :
				flat.plugInSocket(choose);
				break;
			case 3 :
				flat.plugInSocket(choose);
				break;
			case 4 :	
				flat.plugInSocket(choose);
				break;
			case 5 :	
				flat.plugInSocket(choose);
				break;
			case 6 :	
				flat.plugInSocket(choose);
				break;
			
			default :
				System.out.println("Your choose is incorrect");
				break;
			}
			System.out.print("If you want to count spending electricity then press 'Y' or press other keys to continue : ");
			String count=scan.next();
			if(count.equalsIgnoreCase("y"))break;
		}
	
		System.out.println("List of connected device : ");flat.printDevices();
		System.out.print("How many hours to calculate energy costs : ");hour= scan.nextInt();
		System.out.print("Calculate spending the energy for one hour : ");flat.CalculatePowerConsumptionForOneHour(hour);
		
		System.out.println("The devices that are most consuming electricity : ");flat.printSortedDeviceBySpendingEnergy(hour);
		
	}
}