package TaskManagement8.User;

public class RegularUser extends User {

    // Constructor
    public RegularUser(String username, String password) {
        super(username, password);
    }

    // Implementation of login method for RegularUser
    @Override
    public void login() {
        System.out.println("Regular User logged in");
        // Specific implementation for RegularUser login
    }

    // Additional methods specific to RegularUser can be added here
    // For example:
    public void viewProfile() {
        System.out.println("Regular User viewing profile");
    }
}
