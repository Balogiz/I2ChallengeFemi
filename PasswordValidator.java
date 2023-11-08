
import java.util.regex.*;
class PasswordValidator {

    /**
     * A Java Program to validate password using Regex - Use case is as below
     * Design and implement some code that validates a password
     * The password will be provided by the user (as an argument of the method) and should return if the password is valid or not.
     * A valid password should meet the following criteria: -
     * Have more than 8 characters
     * Contains a capital letter
     * Contains a lowercase
     * Contains a number
     * Contains an underscore
     */

    // Method to validate the password.
    public static boolean
    isValidPassword(String password)
    {

        // Regex to check validate password.
        String regex = "^(?=.*[0-9])"  // Contains a number
                + "(?=.*[a-z])(?=.*[A-Z])" // Contains a capital and a lower case
                + "(?=.*[_])" // Contains an underscore
                + "(?=\\S+$).{8,}$"; // Have more than 8 characters


        // Compile the Regex
        Pattern p = Pattern.compile(regex);

        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);

        // Return if the password
        // matched the ReGex
        return m.matches();
    }
}
