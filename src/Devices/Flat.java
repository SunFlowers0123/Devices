package Devices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Enum.TypeOfTool;

public class Flat {

	private List<Tools>listOfInstruments=new ArrayList<Tools>();
	private boolean [] isFilled = new boolean[7]; // array where we add boolean varriable .
	//When we get true result then the device was pluged in
	
	public void plugInSocket(int choose) {
		
		if(isFilled[choose]==false) {
			isFilled[choose]=true;
			System.out.println("The device is connect ");
			if(choose==1)listOfInstruments.add(new Microwave(TypeOfTool.MICROWAVE, true));
			if(choose==2)listOfInstruments.add(new Computer(TypeOfTool.COMPUTER, true));
			if(choose==3)listOfInstruments.add(new Lamp(TypeOfTool.LAMP, true));
			if(choose==4)listOfInstruments.add(new Boiler(TypeOfTool.BOILER, true));
			if(choose==5)listOfInstruments.add(new Refrigerator(TypeOfTool.REFRIGERATOR, true));
			if(choose==6)listOfInstruments.add(new Kettle(TypeOfTool.KETTLE, true));
		}else if(isFilled[choose]==true){
			System.out.println("Your instrument was connected before.");
		}
	}
	
	
	public void printDevices() { // here we print list of devices in typeOfTool values
		for(int i=0;i<listOfInstruments.size();i++) {
			System.out.println(listOfInstruments.get(i).getTypeOfTool());
		}
	}
	
	public void CalculatePowerConsumptionForOneHour(int howManyHour) { // Here we calculate using current power in kilowatt
		double sum=0;
		for(int i=0;i<listOfInstruments.size();i++) {
			sum = sum +listOfInstruments.get(i).getPower() * howManyHour ;
		}
		System.out.println(sum + " kilowatt .");
	}
	
	public void printSortedDeviceBySpendingEnergy(int howManyHour) {// here we sorted devices in spending energy
		sortDevicesByPrice(listOfInstruments);
		for(int i=listOfInstruments.size()-1;i>0;i--) {
			System.out.println(i + " ) " +listOfInstruments.get(i).getTypeOfTool() + "    " + listOfInstruments.get(i).getPower()* howManyHour);
		}
	}
	
	private void sortDevicesByPrice(List<Tools> list){//sort devices in current power
        Collections.sort(list, new Comparator<Tools>() {
            @Override
        	public int compare(Tools o1, Tools o2) {
                return Double.compare(o1.getPower(), o2.getPower());
            }
        });
	}
}




