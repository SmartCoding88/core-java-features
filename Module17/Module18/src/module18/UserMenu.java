/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module18;

import java.util.Scanner;

/**
 *
 * @author testuser
 */
public class UserMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        while (!input.equals("5")) {
            System.out.println("Select the one of the following options :");
            System.out.println("Enter 1 for adding a book");
            System.out.println("Enter 2 for adding a member");
            System.out.println("Enter 3 for issuing a book");
            System.out.println("Enter 4 for returning a book");
            input = showMenu(sc);
        }

    }

    public static String showMenu(Scanner sc) {

        switch (sc.nextLine().toString().toLowerCase()) //This way it doesn't matter if they typed an uppercase letter
        {
            case "1":
                System.out.println("You have selected option 1");
                AddBook.addBookMenu();
                return "1";
            case "2":
                System.out.println("You have selected option 2");
                AddMember.addMemberMenu();
                return "2";
            case "3":
                System.out.println("You have selected option 3");
                LibFunction.issueBookMenu();
                return "3";
            case "4":
                System.out.println("You have selected option 4");
                LibFunction.returnBookMenu();
                return "4";
            default:
                System.out.println("Thank you");
                return "5";
        }

    }
}
