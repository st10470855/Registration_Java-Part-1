/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.registration;

/**
 *
 * @author Student
 */

public class Login {

    String username;
    String password;
    String phoneNumber;

    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        return password.length() >= 8 && hasUpper && hasNumber && hasSpecial;
    }

    public boolean checkCellPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\+27\\d{9}");
    }

    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String returnLoginStatus(boolean success) {
        if (success) {
            return "Welcome user, it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}