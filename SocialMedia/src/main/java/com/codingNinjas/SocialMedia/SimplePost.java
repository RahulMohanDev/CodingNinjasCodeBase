package com.codingNinjas.SocialMedia;

public class SimplePost implements Post {
	
	String post;

	@Override
	public String getPost() {
		return post;
	}

	@Override
	public void setPost(String post) {
		this.post = post;
	}

}
