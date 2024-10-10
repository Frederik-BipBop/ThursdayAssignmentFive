package Task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

public ArrayList<String> coffeeMenu = new ArrayList<>();

    public ArrayList<String> getCofeeMenu() {
        return coffeeMenu;

    }

    public void loadMenuData() {
        try {

            File file = new File("coffees.txt");
        Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }

        }catch(FileNotFoundException e){
            System.out.println("file not found. Check path and filename");
        }
    }

}


