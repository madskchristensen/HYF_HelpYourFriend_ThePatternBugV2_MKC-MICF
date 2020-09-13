import java.io.File;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] array = DatasetLoader.get2dArrayFromDataset(new File("resources\\data1.txt"));

        System.out.println(Arrays.deepToString(array));
    }
}
