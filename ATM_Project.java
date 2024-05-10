package com.Java.ATM.Project;

import java.io.*;
import java.util.*;

public class ATM_Project {
	public static void main(String[] args) {
		int pin=1234;
		int balance=10000;
		int addamount=0;
		int takeamount=0;
		String name;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Pin Number");
		int password=scan.nextInt();
		
		if(password==pin) {
			System.out.println("Enter your name");
			name=scan.next();
			System.out.println("Welcome "+name);
			
			while(true) {
				System.out.println("Press 1 to check your Balance");
				System.out.println("Press 2 to add Amount");
				System.out.println("Press 3 to Withdraw Amount");
				System.out.println("Press 4 to print Reciept");
				System.out.println("Press 5 to EXIT!!!");
				
				int output = scan.nextInt();
				switch(output) {
				case 1:
					System.out.println("Your current Balance is: "+balance);
					break;
				case 2:
					System.out.println("How much amount do you want to add to your account");
					addamount=scan.nextInt();
					System.out.println("Successfully Credited "+addamount+" rupees to your account");
					balance=addamount+balance;
					System.out.println("Your current Balance is: "+balance);
					break;
				case 3:
					System.out.println("How much amount do you want to withdraw from your account");
					takeamount=scan.nextInt();
					if(takeamount>balance) {
						System.out.println("You have insufficent balance");
						System.out.println("Check your balance and try less than your balance to withdraw");
					}else {
						System.out.println("Please withdraw your money and collect your receipt");
						System.out.println("Successfully withdrawn "+takeamount+" rupees from your account");
						balance=balance-takeamount;
						System.out.println("Your current Balance is: "+balance);
					}
					break;
				case 4:
					System.out.println("Welcomr to Java mini ATM");
					System.out.println("Available balance is "+balance);
					System.out.println("Amount deposited     "+addamount);
					System.out.println("Amount Withdrawn     "+takeamount);
					System.out.println("Thanks for coming Vist again");
					break;
					default:
						System.out.println("Press the number 5 to exit");
						break;
					
				}
				if(output==5) {
					System.out.println("Thankyou visit again");
					break;
				}
			}
		}else {
			System.out.println("wrong Pin number try again");
		}
	}

}
