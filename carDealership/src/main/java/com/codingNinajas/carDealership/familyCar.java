package com.codingNinajas.carDealership;

public class familyCar implements Car {
	
	String tyreInfo;
	
	public familyCar(Tyre tyre) {
		this.tyreInfo = tyre.getTyreInfo();
	}

	@Override
	public String getInfo() {
		return "family car with " + tyreInfo;
	}

}
