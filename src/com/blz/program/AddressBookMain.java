package com.blz.program;

import java.util.Scanner;

public class AddressBookMain {
	Scanner scanner = new Scanner(System.in);

	public void chooseOption() {
		AddressBookService addressBookService = new AddressBookService();

		boolean isExit = false;
		while (!isExit) {
			System.out.print(
					"Enter Number As Per Your Choice:\n1.Add-New Contacts:\n2.Display-All Records:\n3.Edit Contact\n"
							+ "\n4.Delete Contact\n5.Create a file:\n6.Write into file\n7.Read a file\n8.Write to csv file\n9.Read from csv file\n10.Write into JSON\n11.Read from Json\n12.Exit\n");
			int userInput = scanner.nextInt();
			switch (userInput) {
			case 1:
				// add new contact.
				addressBookService.addDetails();
				break;
			case 2:
				// display all contact.
				addressBookService.displayContacts();
				break;
			case 3:
				// edit existing contact.
				addressBookService.editContact();
				break;
			case 4:
				// delete existing contact.
				addressBookService.deleteContact();
				break;
			case 5:
				// Create a file
				addressBookService.fileCreate();
				break;
			case 6:
				// Write into file
				addressBookService.fileWrite();
				break;
			case 7:
				// read from file
				addressBookService.fileReader();
				break;
			case 8:
				// write to csv file.
				addressBookService.writeToCsv();
				break;
			case 9:
				// read from csv file.
				addressBookService.readFromCsvFile();
				break;
			case 10:
				// write into json file.
				addressBookService.writeToJson();
				break;
			case 11:
				// read from json file.
				addressBookService.readFromJson();
				break;
			case 12:
				// Exit from program.
				isExit = true;
				break;
			default:
				System.out.println("Please enter valid input");
			}
		}
	}

	public static void main(String[] args) {
		AddressBookMain addressBookMain = new AddressBookMain();
		addressBookMain.chooseOption();
	}

}
