import java.io.File;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] array2 = DatasetLoader.get2DArrayFromFile(new File("resources\\data1.txt"));

        int[][] array = DatasetLoader.get2DArrayFromFile(new File("resources\\data2.txt"));

        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(array2));
    }
}
