package Devices;
import Enum.TypeOfTool;

public abstract class Tools {
	
	private boolean isPluggedIn;
	private double power ;
	private TypeOfTool typeOfTool;
	
	
	public TypeOfTool getTypeOfTool() {
		return typeOfTool;
	}
	public void setTypeOfTool(TypeOfTool typeOfTool) {
		this.typeOfTool = typeOfTool;
	}
	public boolean isPluggedIn() {
		return isPluggedIn;
	}
	public void setPluggedIn(boolean isPluggedIn) {
		this.isPluggedIn = isPluggedIn;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	
	
	
}

class Microwave extends Tools{
	
	public Microwave(TypeOfTool typeOfTool,boolean isPluggedIn) {
		setTypeOfTool(typeOfTool);
		setPluggedIn(isPluggedIn);
		setPower(1.2);//к¬“за 1 годину
	}
	
	
}


class Computer extends Tools {
	
	public Computer(TypeOfTool typeOfTool, boolean isPluggedIn) {
		setTypeOfTool(typeOfTool);
		setPluggedIn(isPluggedIn);
		setPower(0.55);
	}
	
}

class Lamp extends Tools{
	
	public Lamp(TypeOfTool typeOfTool,boolean isPluggedIn) {
		setTypeOfTool(typeOfTool);
		setPluggedIn(isPluggedIn);
		setPower(0.9);
	}
	
}

class Boiler extends Tools{
	
	public Boiler(TypeOfTool typeOfTool,boolean isPluggedIn){
		setTypeOfTool(typeOfTool);
		setPluggedIn(isPluggedIn);
		setPower(7);
	}
	
}

class Refrigerator extends Tools{
	
	public Refrigerator(TypeOfTool typeOfTool,boolean isPluggedIn) {
		setTypeOfTool(typeOfTool);
		setPluggedIn(isPluggedIn);
		setPower(0.65);
	}
	
}

class Kettle extends Tools {
	
	public Kettle(TypeOfTool typeOfTool,boolean isPluggedIn) {
		setTypeOfTool(typeOfTool);
		setPluggedIn(isPluggedIn);
		setPower(2.2);
	}
	
}
