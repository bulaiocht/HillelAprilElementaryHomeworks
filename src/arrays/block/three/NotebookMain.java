package arrays.block.three;

/**
 * Created by Vitalii Kocherga on 18.04.2016.
 */

public class NotebookMain {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        NotebookCLI notebookCLI = new NotebookCLI();
        NotebookController controller = new NotebookController(notebook, notebookCLI);
    }
}
