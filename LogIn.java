package TaskManagement8.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.println("Enter password: ");
        String inputPassword = scanner.nextLine();

        String filename = "/Users/keomunin/Documents/Java/TaskManagement7/User/Registered_User.txt";
        boolean isAuthenticated = false;
        boolean isAdmin = false;

        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] userData = line.split(" / ");

                if (userData.length == 2 && userData[0].equals(inputUsername) && userData[1].equals(inputPassword)) {
                    isAuthenticated = true;
                    if (inputUsername.equals("admin")) {
                        isAdmin = true;
                    }
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (isAuthenticated) {
            System.out.println("\nLogin Successfully! ");
            if (isAdmin) {
                Admin admin = new Admin(inputUsername, inputPassword);
                admin.modifyUser(admin, filename, inputPassword);
                admin.login();
                admin.printAdminMessage();
            } else{
                RegularUser regularUser = new RegularUser(inputUsername, inputPassword);
                regularUser.login();
                System.out.println("Welcome!");
            }
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
