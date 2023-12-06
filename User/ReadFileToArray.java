package TaskManagement8.User;

import java.io.*;
import java.util.*;

public class ReadFileToArray {
    public static void main(String[] args) {
        String filename = "/Users/keomunin/Documents/Java/TaskManagement7/User/Registered_User.txt"; // Replace 'data.txt' with your file name
        List<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Convert ArrayList to an array if needed
        String[] dataArray = lines.toArray(new String[0]);

        // Displaying the content of the array
        for (String line : dataArray) {
            System.out.println(line);
        }

        // print specific record at specific index (to search for account)
        // String index = dataArray[2];
        // System.out.println(index);
    }
}
