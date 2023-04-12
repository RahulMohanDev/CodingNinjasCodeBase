package com.codingNinjas.SocialMedia;

import java.util.ArrayList;

public interface PostList {
	public ArrayList<Post> getAllPosts(); 
	public void setPost(Post post);
	public Post getPost(int i);
	public int size();
}
