package com.codingNinajas.carDealership;

public class SportsCar implements Car {
	String tyreInfo;
	
	public SportsCar(Tyre tyre) {
		this.tyreInfo = tyre.getTyreInfo();
	}

	@Override
	public String getInfo() {
	  return "you have a new sports car with "+ tyreInfo;	
	}

}
