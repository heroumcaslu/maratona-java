package com.devdojo.modificadorestatico;

public class Car {

	// Velocidade limite = 240km/h
	private String name;
	private double maxSpeed;
	private static double speedLimit = 240;

	public Car(String name, double maxSpeed) {
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
	}
	
	public Car() {
		
		
		
	}
	
	public void print() {
		
		System.out.println(this.name+": velocidade máxima = "+this.maxSpeed+", velocidade limite = "+Car.speedLimit);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getSpeedLimit() {
		return speedLimit;
	}

	public void setSpeedLimit(double speedLimit) {
		Car.speedLimit = speedLimit;
	}

}
