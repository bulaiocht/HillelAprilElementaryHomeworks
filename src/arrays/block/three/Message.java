package arrays.block.three;

/**
 * This enum consists standard application messages
 * Created by Kocherga Vitalii
 */
enum Message {

    FIRST_NAME("First name:", "Incorrect First name!"),
    LAST_NAME("Last name:", "Incorrect Last name!"),
    PATRONYMIC("Patronymic:", "Incorrect Patronymic!"),
    NICNAME("Last name:", "Incorrect Last name!"),
    GROUP("Select Group for contact:", "No such group"),
    COMMENT("Add a comment for contact:", ""),
    HOME_PHONE("Home phone number:", "Incorrect phone number format!"),
    MOBILE_PHONE("Mobile phone number:", "Incorrect phone number format!"),
    EMAIL("Email:", "Incorrect email format!"),
    SKYPE("Skype login:", "Incorrect skype login format!"),
    ADDRESS("Address", "Incorrect address format!");

    private String errorMessage;
    private String commonMessage;

    Message(String commMess, String errMess) {
        this.commonMessage = commMess;
        this.errorMessage = errMess;
    }

    /**
     * Getting message depending on received boolean argument
     *
     * @param check from some outer method maybe
     * @return String message
     */
    public String getMessage(boolean check) {
        if (check) {
            return commonMessage;
        } else return errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getCommonMessage() {
        return commonMessage;
    }
}
