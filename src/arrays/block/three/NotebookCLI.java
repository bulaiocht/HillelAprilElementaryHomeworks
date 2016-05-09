package arrays.block.three;

import java.util.Scanner;

/**
 * This class provides command line interface.
 * Created by ArtLiner on 18.04.2016.
 */

public class NotebookCLI {

    /**
     * @return user command line input as a String object
     */
    public String userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    /**
     * String object and printing it
     *
     * @param message is user command line input or any other String object
     * @return String object
     */
    public String printMessage(String message) {
        System.out.println(message);
        return message;
    }


}