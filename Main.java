package TaskManagement2;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        System.out.println("How many projects do you want to create?");
        int numProjects = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < numProjects; i++) {
            System.out.println("Enter the name of project " + (i+1) + ":");
            String projectName = scanner.nextLine();

            System.out.println("Enter the status of project " + (i+1) + ":");
            String projectStatus = scanner.nextLine();

            Project project = new Project(projectName, "project" + (i+1), projectStatus, new Date(), "task" + (i+1));

            System.out.println("How many tasks do you want to create for this project?");
            int numTasks = scanner.nextInt();
            scanner.nextLine(); // consume newline

            for (int j = 0; j < numTasks; j++) {
                System.out.println("Enter the name of task " + (j+1) + ":");
                String taskName = scanner.nextLine();

                System.out.println("Enter the status of task " + (j+1) + ":");
                String taskStatus = scanner.nextLine();

                Tasks task = new Tasks(taskName, username, "task" + (j+1), taskStatus, new Date());
            }
        }

        System.out.println("User " + user.getUsername() + " created " + numProjects + " projects and tasks successfully.");
    }
}

        