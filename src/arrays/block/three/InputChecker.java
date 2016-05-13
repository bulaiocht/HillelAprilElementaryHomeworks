package arrays.block.three;

import java.util.Date;

/**
 * Interface consisting basic regex constants for user input validation.
 * Created by Vitalii Kocherga on 18.04.2016.
 */

interface InputChecker {

    /**
     * REGEX pattern for Name
     */
    String REG_NAME = "^[a-zA-Z]{2,4}[a-zA-Z]{0,11}[^!*@#$%^&*()=\\-+\\s\\\\~'\"]";
    /**
     * REGEX pattern for nickname
     */
    String REG_NICK = "^[a-zA-Z]{2,4}[a-zA-Z0-9]{0,11}[^!*@#$%^&*()=\\-+\\s\\\\~'\"]";
    /**
     * REGEX pattern for telephone number in international format +000XXXXXXXXX
     */
    String REG_PHONE_INTERN = "^(\\+[0-9]{1}[0-9]{2})([0-9]{9})$";
    /**
     * REGEX pattern for email validation;
     */
    String REG_EMAIL = "^[a-zA-Z]{1}[a-zA-Z0-9]{4}[\\.]?[a-zA-Z0-9]{1,25}@[a-z]+\\.[a-z]{2,3}$";
    /**
     * REGEX pattern for skype login
     */
    String REG_SKYPE = "^[a-z]{1}[a-zA-Z0-9._-]{5,27}$";
    /**
     * REGEX pattern for address in format: "INDEX (5 digits), City, Street, House number (for ex. 15, 15a), Appartment number"
     */
    String REG_ADDRESS = "[0-9]{5},\\s[a-zA-Z.-\\s]{3,},\\s[a-zA-Z.-\\s]{3,},\\s[0-9]{1,3}[a-z]?,\\s[0-9]{1,3}";

    boolean checkInput(String input, String regex);

}
