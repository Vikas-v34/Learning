package com.practice;

class TypeException extends Exception{
	

	public String toString() {
		return "Vehicle type not set";
	}
}
class Vehicles{
	String type;
	String model_no;
	String model_name;
	String owner_name;
	String owner_details;
	
	public Vehicles() {
		
	}
	public Vehicles(String model_no,String model_name,String owner_name,String owner_details) {
		this.model_no = model_no;
		this.model_name = model_name;
		this.owner_name = owner_name;
		this.owner_details = owner_details;
	}
	public String get_type() {
		return type;
	}
	public String retrieve() {
		return "null";
	}
	
}
class Car extends Vehicles{
	public Car() {
		
	}
	public Car(String model_no,String model_name,String owner_name,String owner_details) {
		super(model_no,model_name,owner_name,owner_details);
	}
	public String get_type() {
		return type;
	}
	public void set_type(String type) {
		this.type = type;
	}
	@Override
	public String retrieve(){
		try{
			if(type.equals("")) {
				throw new TypeException();
			}
			else {
				
				System.out.println(model_no+" "+model_name+" "+owner_name+" "+owner_details);
			}
		}catch(TypeException e) {
			System.out.println(e);
		}
	return null;
	}
}

public class Source {

	public static void main(String[] args) {
		Car obj = new Car("Lykan","W motors","thouseef","engineer");
		obj.set_type("");
		obj.retrieve();

	}

}
