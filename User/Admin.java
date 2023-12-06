package TaskManagement8.User;

public class Admin extends User {

    // Constructor
    public Admin(String username, String password) {
        super(username, password);
    }

    // Implementation of login method for Admin
    @Override
    public void login() {
        System.out.println("Admin logged in");
        // Specific implementation for Admin login
    }

    // Additional methods specific to Admin can be added here
    // For example:
    public void modifyUser(User user, String newName, String newPassword) {
        if (user instanceof User) {
            ((User) user).setUsername(newName);
            ((User) user).setPassword(newPassword);
            System.out.println("User modified successfully.");
        } else {
            System.out.println("Invalid user type");
        }
    }

    public void printAdminMessage() {
        System.out.println("Welcome admin!");
    }
}
