package TaskManagement2;

import java.util.Date;

public class Project {
    private String projectname;
    private String projectid;
    private String projectstatus;
    private Date deadline;
    private String taskid;

    public Project(String projectname, String projectid, String projectstatus, Date deadline, String taskid) {
        this.projectname = projectname;
        this.projectid = projectid;
        this.projectstatus = projectstatus;
        this.deadline = deadline;
        this.taskid = taskid;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public void setProjectstatus(String projectstatus) {
        this.projectstatus = projectstatus;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getProjectname() {
        return this.projectname;
    }

    public String getProjectstatus() {
        return this.projectstatus;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getTaskid() {
        return this.taskid;
    }
}