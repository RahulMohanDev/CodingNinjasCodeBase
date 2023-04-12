package com.codingNinjas.SocialMedia;

import java.util.ArrayList;

public class SimplePostList implements PostList {
	
	ArrayList<Post> posts;
	
	public SimplePostList() {
		this.posts =new ArrayList<Post>();
	}
	
	@Override
	public ArrayList<Post> getAllPosts() {
		return this.posts;
	}

	@Override
	public void setPost(Post post) {
		this.posts.add(post);
	}

	@Override
	public int size() {
		return this.posts.size();
	}

	@Override
	public Post getPost(int i) {
		return this.posts.get(i);
	}

}
