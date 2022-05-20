package com.revature.controller;

import java.util.Scanner;

import com.revature.entity.RevatureUser;
import com.revature.service.RevatureService;
import com.revature.service.RevatureServiceInterface;

public class RevatueController implements RevatureControllerInterface {

	public void createProfileController() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter Password: ");
		String password = sc.next();
		
		System.out.println("Enter Email: ");
		String email = sc.next();
		
		System.out.println("Enter Address: ");
		String address = sc.next();
		
		RevatureUser ru = new RevatureUser();
		ru.setName(name);
		ru.setPassword(password);
		ru.setEmail(email);
		ru.setAddress(address);
		
		RevatureServiceInterface rs = new RevatureService();
		int i = rs.createRevatureService(ru);
		
		if(i>0) {
			System.out.println("Your profile is created "+name);
		}
		
		else {
			System.out.println("Profile not created");
		}
		
		
		
	}

	public void viewProfileController() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Email: ");
		String email = sc.next();
		
		RevatureUser ru = new RevatureUser();
		ru.setEmail(email);
		
		RevatureServiceInterface rs = new RevatureService();
		RevatureUser i = rs.viewRevatureService(ru);
		
		if(i!=null) {
			
			System.out.println("Name is "+i.getName());
			System.out.println("Password is "+i.getPassword());
			System.out.println("Email is "+i.getEmail());
			System.out.println("Address is "+i.getAddress());
			
		}
		
		else {
			
			System.out.println("Profile not found");
			
		}
		
	}

}
