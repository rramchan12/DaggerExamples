package com.ravi.kickstart.dagger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCarComponent carComponent= DaggerMyCarComponent.builder().build();
		Car car = carComponent.provideCar();	
		carComponent.inject((MarutiErtigo)car);
		car.run();
	}

}
