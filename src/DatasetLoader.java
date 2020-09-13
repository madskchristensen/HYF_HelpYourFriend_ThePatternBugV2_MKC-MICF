import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Klassen har til ansvar at indlæse dataset fra en fil og pakke det ind i et 2d array.
// Dette 2d array kan vidergives til MazeBuilder som benytter det til at bygge labyrinten.
public class DatasetLoader {

    public static int[][] get2dArrayFromDataset(File file) {
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
                array2d.add(arrayTemp);
            }

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        return (int[][]) array2d.toArray();
    }

    // variabel der indeholder det endelige 2d array
    // find størrelsen på "master array" samt hvert array i dette via scanner objektet

    /*
    public static int[][] getPrimitive2dArrayFromDataSet(File file) {
        int[][] array2d;
        Scanner scannerFile;
        int masterArraySize;
        int singleArraySize;

        try {
            scannerFile = new Scanner(file);
            singleArraySize = scannerFile.nextInt();

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        return array2d;
    }

     */
}