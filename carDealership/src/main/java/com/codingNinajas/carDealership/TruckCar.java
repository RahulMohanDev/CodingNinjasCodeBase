package com.codingNinajas.carDealership;

public class TruckCar implements Car{
	String tyreInfo;
	
	public TruckCar(Tyre tyre) {
		this.tyreInfo = tyre.getTyreInfo();
	}


	@Override
	public String getInfo() {
		return "You truck is ready with " + tyreInfo;
	}

}
