package com.codingNinjas.codingNinjasApp;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class CodingNinjasAppApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CodingNinjasAppApplication.class, args);
		System.out.println("Welcome to the coding ninjas application");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ArrayList<PaidCourse> paidCourses = new ArrayList<PaidCourse>();
		PaidCourse javaCourse = (PaidCourse) context.getBean("javaCourse");
		PaidCourse springCourse = (PaidCourse) context.getBean("springCourse");
		javaCourse.courseInstructor.setInstructorDetails("Rohan Singh", "23");
		javaCourse.setCourseDetails("Basic of Java");
		springCourse.courseInstructor.setInstructorDetails("Rahul Mohan", "26");
		springCourse.setCourseDetails("Spring and Spring boot");
		paidCourses.add(javaCourse);
		paidCourses.add(springCourse);

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Please select from the following:");
			System.out.println("1) register a new user");
			System.out.println("2) See course information");
			System.out.println("3) to quit");
			int option = scanner.nextInt();

			// flush the scanner
			scanner.nextLine();

			switch (option) {
			case 1: {
				// get the user (prototype bean)
				User user = (User) context.getBean("simpleUser");
				System.out.println("Please enter your name");
				String name = scanner.nextLine();
				System.out.println("Please enter your age");
				String age = scanner.nextLine();
				System.out.println("Please enter your College");
				String college = scanner.nextLine();
				System.out.println("Please enter your location");
				String location = scanner.nextLine();
				user.setUserDetails(name, age, location, college);
				int index = 0;
				System.out.println("Please select a course");
				for (Course course : paidCourses) {
					System.out.println(index + ")" + course.getCourseName());
					index++;
				}
				int courseId = scanner.nextInt();
				if (courseId >= paidCourses.size()) {
					System.out.println("Not a valid course");
					break;
				}
				PaidCourse selectedCourse = paidCourses.get(courseId);
				selectedCourse.userList.addUser(user);
				break;
			}

			case 2: {
				for (Course course : paidCourses) {
					System.out.println(course.getCourseName());
					if (course.getUserList().getUserList().size() > 0) {
						System.out.println("\t\t The students in the course");
						for (User user : course.getUserList().getUserList()) {
							System.out.println("\t\t " + user.getUserDetails());
						}
					} else {
						System.out.println("No students registerd for the course");
					}
				}
				break;
			}
			case 3: {
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
			if (option == 3) {
				break;
			}
		}

		System.out.println("program stopped");
		scanner.close();
		context.close();

	}

}
