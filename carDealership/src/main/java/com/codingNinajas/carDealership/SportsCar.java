package com.codingNinajas.carDealership;

public class SportsCar implements Car {
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
	
	public SportsCar(Tyre tyre) {
		this.tyreInfo = tyre.getTyreInfo();
	}

	@Override
	public String getInfo() {
	  return "you have a new sports car with "+ tyreInfo;	
	}

}
