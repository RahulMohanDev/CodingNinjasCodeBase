package com.codingNinajas.carDealership;

public class TruckCar implements Car{
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
	
	public TruckCar(Tyre tyre) {
		this.tyreInfo = tyre.getTyreInfo();
	}


	@Override
	public String getInfo() {
		return "You truck is ready with " + tyreInfo;
	}

}
