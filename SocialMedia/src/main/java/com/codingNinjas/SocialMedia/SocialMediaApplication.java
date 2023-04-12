package com.codingNinjas.SocialMedia;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SocialMediaApplication {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("choose from the following");
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    PostList postList = context.getBean("postList",PostList.class);
	while(true) {
		System.out.println("1) post a new post \n 2)view posts 3)exit");
		int menuItem = scanner.nextInt();
		switch (menuItem) {
		case 1:
		    Post post = context.getBean("post",Post.class);
		    scanner.nextLine();
		    System.out.println("please type out your post");
		    String postConent = scanner.nextLine();
		    post.setPost(postConent);
		    postList.setPost(post);
		    break;
		case 2: 
			if(postList.size() == 0) {
				System.out.println("no post exsists, make a post");
			}
			for (int i = 0; i < postList.size(); i++) {
			    System.out.println(i+"---"+postList.getPost(i).getPost()+"----");
			}
			break;
		case 3: 
			break;
		default:
			System.out.println("not a valid choise choose again");
		}
		if(menuItem==3) {
			break;
		}
	}
	scanner.close();
	}

}
