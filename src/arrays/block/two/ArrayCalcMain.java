package arrays.block.two;

/**
 * Created by Vitalii Kocherga on 18.04.2016.
 */
public class ArrayCalcMain {
    public static void main(String[] args) {
        ArrayCalcModel model = new ArrayCalcModel();
        ArrayCalcView view = new ArrayCalcView();
        ArrayCalcController controller = new ArrayCalcController(model, view);
    }
}
