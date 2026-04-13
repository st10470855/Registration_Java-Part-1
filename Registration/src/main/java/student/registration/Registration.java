/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package student.registration;

/**
 *
 * @author Student
 */


import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Login userLogin = new Login();

        //--- USERNAME ---
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (userLogin.checkUserName(username)) {
            System.out.println("Username successfully captured.");
            userLogin.username = username;
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }

        // --- PASSWORD ---
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userLogin.checkPasswordComplexity(password)) {
            System.out.println("Password successfully captured.");
            userLogin.password = password;
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }

        // --- PHONE ---
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        if (userLogin.checkCellPhoneNumber(phone)) {
            System.out.println("Cell phone number successfully added.");
            userLogin.phoneNumber = phone;
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }

        // Final message
        if (userLogin.username != null && userLogin.password != null && userLogin.phoneNumber != null) {
            System.out.println("User registered successfully.");
        }

        // --- LOGIN ---
        System.out.println("\n--- LOGIN ---");

        System.out.print("Enter username to login: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter password to login: ");
        String loginPassword = scanner.nextLine();

        boolean success = userLogin.loginUser(loginUsername, loginPassword);
        System.out.println(userLogin.returnLoginStatus(success));

        scanner.close();
    }
}

