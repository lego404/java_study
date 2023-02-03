/*
 * Car.java
 * 생성자의 오버로딩 
 */
package sec03.exam033;

public class Car{
	//field
	String company = "HD";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}