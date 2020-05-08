package com.durgaSoft.section6.lecture33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {
		Predicate<User> userAuth = user -> user.userName == "Durga" && user.password =="Java";
		User user1 = new User("user1", "password1");
		System.out.println(userAuth.test(user1));
		user1 = new User("Durga", "Java");
		System.out.println(userAuth.test(user1));
		user1 = new User("Durga", "password1");
		System.out.println(userAuth.test(user1));
	}

}

class User{
	
	 String userName;
	
	 String password;
	 
	 public User(String userName, String password) {
		// TODO Auto-generated constructor stub
		 this.userName = userName;
		 this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	 
	 
}