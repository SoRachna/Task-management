package TaskManagement8.TaskManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your username:");
            String username = scanner.nextLine();

            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            //User user = new User(username, password);

            ArrayList<Project> userProjects = new ArrayList<>();

            do {
                System.out.println("How many projects do you want to create? (Enter 0 to quit)");
                int numProjects = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (numProjects == 0) {
                    System.out.println("Exiting...");
                    scanner.close(); // Close the scanner
                    return; // Exit the program
                }

                for (int i = 0; i < numProjects; i++) {
                    System.out.println("Enter the name of project " + (i + 1) + ":");
                    String projectName = scanner.nextLine();

                    System.out.println("Enter the status of project " + (i + 1) + ":");
                    String projectStatus = scanner.nextLine();

                    Project project = new Project(username, password, projectName, projectStatus);

                    System.out.println("How many tasks do you want to create for this project?");
                    int numTasks = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    for (int j = 0; j < numTasks; j++) {
                        System.out.println("Enter the name of task " + (j + 1) + ":");
                        String taskName = scanner.nextLine();

                        System.out.println("Enter the status of task " + (j + 1) + ":");
                        String taskStatus = scanner.nextLine();

                        Tasks task = new Tasks(taskName, username, "task" + (j + 1), taskStatus, new Date());
                        project.addTask(task);
                    }

                    userProjects.add(project);
                }

                System.out.println("Do you want to continue adding projects? (yes/no)");
            } while (scanner.nextLine().equalsIgnoreCase("yes"));

            System.out.println("Generating report...");

            // Print the report for all projects and tasks
            for (Project p : userProjects) {
                System.out.println("Project Name: " + p.getProjectName());
                System.out.println("Project Status: " + p.getProjectStatus());
                System.out.println("Tasks:");

                for (Tasks t : p.getTasks()) {
                    System.out.println("- Task Name: " + t.getTaskName());
                    System.out.println("  Task Status: " + t.getTaskStatus());
                    // ... (other task details)
                }
            }

            System.out.println("Exiting...");
            scanner.close(); // Close the scanner
            return; // Exit the program
        }
    }
}
