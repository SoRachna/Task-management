package TaskManagement8.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Register {
    public static void main(String[] args) {

        String tmpName;
        String tmpPassword;

        Scanner sc = new Scanner(System.in);

        String filePath = "/Users/keomunin/Documents/Java/TaskManagement7/User/Registered_User.txt";

        System.out.println("Input name: ");
        tmpName = sc.nextLine();

        System.out.println("Input password: ");
        tmpPassword = sc.nextLine();

        String store_registeredAcc = tmpName + " / " + tmpPassword + "\n";

        User user1 = new User(tmpName, tmpPassword) {
            @Override
            public void login() {
                // Implementing abstract method
                System.out.println("User logged in");
            }
        };

        Admin admin = new Admin("admin", "admin123"); // Creating an Admin object

        // Modify user details using Admin object
        admin.modifyUser(user1, "newUsername", "newPassword");

        try {
            // Create a FileWriter in append mode by passing true as the second parameter
            FileWriter fileWriter = new FileWriter(filePath, true);

            // Wrap the FileWriter in a BufferedWriter for efficient writing
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Append the data to the file
            bufferedWriter.write(store_registeredAcc);
            bufferedWriter.newLine(); // Add a new line for clarity

            // Close the BufferedWriter to ensure all data is flushed to the file
            bufferedWriter.close();

            System.out.println("Data has been appended to the file successfully.");
        } catch (IOException e) {
            // Handle IO exceptions, e.g., if the file cannot be created or written to
            e.printStackTrace();
        }

        sc.close();
    }
}
