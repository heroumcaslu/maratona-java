package com.devdojo.modificadorestatico.test;

import com.devdojo.modificadorestatico.Car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("BMW", 280);
		Car c2 = new Car("Audi", 275);
		Car c3 = new Car("Mercedes", 230);
		
		c1.print();
		c2.print();
		c3.print();
		
		Car.setSpeedLimit(220);

	}

}
