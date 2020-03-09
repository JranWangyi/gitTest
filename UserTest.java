package com.wangyi.test;

public class UserTest {
	
	public static void main(String[] args) {
		User user1 = new User(1,"张三",20);
		User user2 = new User(2,"李四",20);
		
		System.out.println(user1.equals(user2));
	}

}
