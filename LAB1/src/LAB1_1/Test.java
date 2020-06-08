/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_1;

import java.util.Scanner;

/**
 *
 * @author minhv
 */
public class Test {

    public static void main(String[] args) throws Exception {
	LAB1_1.PriorityQueue list = new LAB1_1.PriorityQueue();
	Scanner sc = new Scanner(System.in);
	int choice;
	do {
	    System.out.print("Choice: ");
	    sc = new Scanner(System.in);
	    choice = Integer.parseInt(sc.nextLine());
	    switch (choice) {
		case 1:
		    LAB1_1.FileWriteRead.readData("user.csv", list);
		    break;
		case 2:
		    System.out.print("Email: ");
		    sc = new Scanner(System.in);
		    String email = sc.nextLine();
		    list.deleteUser(email);
		    break;
		case 3:
		    System.out.print("Email: ");
		    sc = new Scanner(System.in);
		    email = sc.nextLine();
		    sc = new Scanner(System.in);
		    System.out.print("Point: ");
		    int point = Integer.parseInt(sc.nextLine());
		    list.updateUser(email, point);
		    LAB1_1.FileWriteRead.writeData("user.csv", list);
		    break;
		case 4:
		    System.out.print("Email: ");
		    sc = new Scanner(System.in);
		    email = sc.nextLine();
		    list.searchUser(email);
		    break;
		case 5:
		    list.removeTop();
		    break;
		case 6:
		    list.getTop();
		case 7:
		    System.out.print("Email: ");
		    sc = new Scanner(System.in);
		    email = sc.nextLine();
		    list.displayPointUserEmail(email);
		case 8: 
		    list.printlist(list);
		    break;
	    }
	} while (choice != 9);
    }
}
