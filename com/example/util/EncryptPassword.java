package com.example.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.Scanner;
import java.util.InputMismatchException;

public class EncryptPassword {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
			
				System.out.println("Press '1' to encrypt password");
				System.out.println("Press '2' to exit");
				int option = sc.nextInt();
				sc.nextLine();
				
				switch(option) {
				case 1: 
					System.out.println("Write the password you want to encrypt:");
					String text = sc.nextLine();
					String encryptedPassword = encryptPassword(text);
					System.out.println("Encrypted password: " + encryptedPassword);
					System.out.println("\n====================================\n");
					break;
				case 2:
					System.exit(0);
					sc.close();
				}
				
			}
			
		} catch(InputMismatchException ex) {
			System.out.println("Please, select an option with '1' or '2' before writing text");
		}
		
	}
	 
	public static String encryptPassword(String password) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.encode(password);
	}

}
