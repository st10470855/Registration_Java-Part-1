/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package student.registration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    Login login = new Login();

    // Username tests
    @Test
    public void usernameValid() { assertTrue(login.checkUserName("ab_cd")); }

    @Test
    public void usernameInvalid() { assertFalse(login.checkUserName("abcdef")); }

    // Password tests
    @Test
    public void passwordValid() { assertTrue(login.checkPasswordComplexity("Abc123!!")); }

    @Test
    public void passwordInvalid() { assertFalse(login.checkPasswordComplexity("password")); }

    // Phone tests
    @Test
    public void phoneValid() { assertTrue(login.checkCellPhoneNumber("+27123456789")); }

    @Test
    public void phoneInvalid() { assertFalse(login.checkCellPhoneNumber("12345")); }

    // Login tests
    @Test
    public void loginCorrect() {
        login.username = "ab_cd";
        login.password = "Abc123!!";
        assertTrue(login.loginUser("ab_cd", "Abc123!!"));
    }

    @Test
    public void loginIncorrect() {
        login.username = "ab_cd";
        login.password = "Abc123!!";
        assertFalse(login.loginUser("wrongUser", "wrongPass"));
    }

    // Login message tests
    @Test
    public void loginMessageSuccess() {
        assertEquals("Welcome user, it is great to see you again.", login.returnLoginStatus(true));
    }

    @Test
    public void loginMessageFail() {
        assertEquals("Username or password incorrect, please try again.", login.returnLoginStatus(false));
    }
}