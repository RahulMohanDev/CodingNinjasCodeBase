package com.codingNinajas.carDealership;

public class familyCar implements Car {
	
	String tyreInfo;
	String name;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public familyCar(Tyre tyre) {
		this.tyreInfo = tyre.getTyreInfo();
	}

	@Override
	public String getInfo() {
		return "family car with " + tyreInfo;
	}


}
