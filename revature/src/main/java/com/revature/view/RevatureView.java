package com.revature.view;

import java.util.Scanner;

import com.revature.controller.RevatueController;
import com.revature.controller.RevatureControllerInterface;

public class RevatureView {

	public static void main(String[] args) {
		
		String s = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while(s.equals("y")) {
			
			System.out.println("********** Main Menu **********");
			
			System.out.println("Press 1 Create Profile");
			System.out.println("Press 2 View Profile");
			
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			
			RevatureControllerInterface rc = new RevatueController();
			
			switch(ch) {
				
				case 1:
					rc.createProfileController();
					break;
					
				case 2:
					rc.viewProfileController();
					break;
					
					
				default:
					System.out.println("Wrong Choice");
			
			}
			
			System.out.println("Press y to continue");
			s = sc.next();
		}
		

	}

}
