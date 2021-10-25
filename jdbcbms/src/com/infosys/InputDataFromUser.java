package com.infosys;

import java.util.Scanner;

public class InputDataFromUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter CID : ");
		int cid = scan.nextInt();
		System.out.println("Enter CNAME : ");
		String cname = scan.next();
		
		EmpDetails details = new EmpDetails();
		details.setCID(cid);
		details.setCNAME(cname);
		
		InsertIntoCustomersTable document = new InsertIntoCustomersTable();
		int i = document.getData(details);
		System.out.println(i + " record Inserted");
		
		scan.close();
				

	}

}
