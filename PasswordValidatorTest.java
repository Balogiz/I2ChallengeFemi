import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {


    @Test
    public void testPasswordMatchesAllScenarios(){

        // Test Case 1:
        String str1 = "TestingPassword1_";
        System.out.println(PasswordValidator.isValidPassword(str1));
        assertTrue(PasswordValidator.isValidPassword(str1));
    }

    @Test
    public void testPasswordFailNumberPresence(){

        // Test Case 2:
        String str1 = "TestingPassword_";
        System.out.println(PasswordValidator.isValidPassword(str1));
        assertFalse(PasswordValidator.isValidPassword(str1));
    }

    @Test
    public void testPasswordFailsLessThanEightCharacters(){

        // Test Case 3:
        String str1 = "Tes_123";
        System.out.println(PasswordValidator.isValidPassword(str1));
        assertFalse(PasswordValidator.isValidPassword(str1));
    }

    @Test
    public void testPasswordFailsNoCapitalLetter(){

        // Test Case 4:
        String str1 = "tes_12345";
        System.out.println(PasswordValidator.isValidPassword(str1));
        assertFalse(PasswordValidator.isValidPassword(str1));
    }

    @Test
    public void testPasswordFailsNoLowerCase(){

        // Test Case 5:
        String str1 = "TES_12345";
        System.out.println(PasswordValidator.isValidPassword(str1));
        assertFalse(PasswordValidator.isValidPassword(str1));
    }

    @Test
    public void testPasswordFailsNoUnderScore(){

        // Test Case 6:
        String str1 = "TestingPassword1";
        System.out.println(PasswordValidator.isValidPassword(str1));
        assertFalse(PasswordValidator.isValidPassword(str1));
    }

    @Test
    public void testEmptyPassword(){

        // Test Case 7:
        String str1 = "";
        System.out.println(PasswordValidator.isValidPassword(str1));
        assertFalse(PasswordValidator.isValidPassword(str1));
    }

}
