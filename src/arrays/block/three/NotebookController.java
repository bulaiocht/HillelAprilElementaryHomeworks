package arrays.block.three;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This is notebook controller class. It ties up model class and user interface.
 * Created by Vitalii Kocherga on 4/20/16.
 */

public class NotebookController implements InputChecker {
    private Notebook notebook;
    private NotebookCLI notebookCLI;

    public NotebookController(Notebook nbook, NotebookCLI nbookCli) {
        this.notebook = nbook;
        this.notebookCLI = nbookCli;
    }

    @Override
    public boolean checkInput(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public boolean checkGroup(String input) {
        for (Group member : Group.values()) {
            if (member.toString().equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }

    public void userProcess() {

    }


}
