package TaskManagement2;
import java.util.ArrayList;

public class User {
    private ArrayList<User> users;
    private String taskid;
    private String username;
    private String password;

    public User() {
        this.users = new ArrayList<>();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getTaskid() {
        return this.taskid;
    }
}
