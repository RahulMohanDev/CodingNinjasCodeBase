package com.codingNinajas.carDealership;

import java.util.Scanner;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CarDealershipApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CarDealershipApplication.class, args);
		System.out.println("please slect a car of choise");
		System.out.println("options \n 1)family car \n 2)sports car \n 3)truck");
		Scanner scanner = new Scanner(System.in);
		int type = scanner.nextInt();
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    
	    Car car = null;
	    switch(type) {
	    case 1:
	    	System.out.println("please choose the tyre\n 1)normal 2)heavy");
			int tyre= scanner.nextInt();
			switch(tyre) {
			case 1:
				car = context.getBean("normalCarNormalTyre",Car.class);
				break;
			case 2:
				car = context.getBean("normalCarSportsTyre",Car.class);
				break;
			default: 
				System.out.println("wrong tyre selected");
				return;
			}
			break;
	    case 2:
	    	car = context.getBean("sportsCar",Car.class);
	    	break;
	    case 3: 
	    	car = context.getBean("truck",Car.class);
	    	break;	
	    default:
	    	System.out.println("not a vaild option");
	    	return;
	    }
	    
	    System.out.println(car.getInfo());

	}

}
