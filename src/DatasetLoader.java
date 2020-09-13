import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Klassen har til ansvar at indlæse dataset fra en fil og pakke det ind i et 2d array.
// Dette 2d array kan vidergives til MazeBuilder som benytter det til at bygge labyrinten.
public class DatasetLoader {

    public static int[][] get2DListFromFile(File file) {
        List<List<Integer>> array2d = new ArrayList<List<Integer>>();
        Scanner scannerFile;

        try {
            scannerFile = new Scanner(file);
            scannerFile.nextLine();

            while(scannerFile.hasNext()) {
                String lineFromFile = scannerFile.nextLine();
                List<Integer> arrayTemp = new ArrayList<>();

                String[] integers = lineFromFile.split(",\\s");

                for (String number : integers){
                    try{
                        arrayTemp.add(Integer.parseInt(number));
                    }catch (NumberFormatException e){
                        e.printStackTrace();
                    }
                }

                arrayTemp.remove(0);
                array2d.add(arrayTemp);
            }

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        return (int[][]) array2d.toArray();
    }

    // todo
    public static int[][] get2DArrayFromFile(File file) {
        int[][] array2d;
        Scanner scannerFile;
        int rowSize = 0;
        int columnSize = 0;

        try {
            scannerFile = new Scanner(file);

            columnSize = scannerFile.nextInt();
            scannerFile.nextLine();

            rowSize = scannerFile.nextLine().split(", ").length - 1;
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        array2d = new int[rowSize][columnSize];

        try {
            scannerFile = new Scanner(file).useDelimiter("\\s*,\\s*");

            scannerFile.nextLine();

            while(scannerFile.hasNext()) {
                for(int i = 0; i < rowSize; i++) {
                    for(int j = 0; j < columnSize; i++) {
                        scannerFile.nextInt();

                        array2d[i][j] = scannerFile.nextInt();
                    }
                }
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        return array2d;
    }
}