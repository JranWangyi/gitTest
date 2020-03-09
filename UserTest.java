package com.wangyi.test;

public class UserTest {
	
	public static void main(String[] args) {
		User user1 = new User(1,"张三",20);
		User user2 = new User(2,"李四",20);
		User user3 = new User(3,"李四",30);
		User user4 = new User(4,"李四",40);
		
		System.out.println(user1.equals(user2));
	}

}
