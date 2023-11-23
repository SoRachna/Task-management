package TaskManagement2;
import java.util.Date;

public class Tasks {
    private String taskname;
    private String taskowner;
    private String taskid;
    private String taskstatus;
    private Date deadline;

    public Tasks(String taskname, String taskowner, String taskid, String taskstatus, Date deadline) {
        this.taskname = taskname;
        this.taskowner = taskowner;
        this.taskid = taskid;
        this.taskstatus = taskstatus;
        this.deadline = deadline;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public void setTaskstatus(String taskstatus) {
        this.taskstatus = taskstatus;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getTaskowner() {
        return this.taskowner;
    }

    public String getTaskname() {
        return this.taskname;
    }

    public String getTaskstatus() {
        return this.taskstatus;
    }
}
