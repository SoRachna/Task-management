package TaskManagement2;
import java.util.ArrayList;

public class Team {
    private String teamname;
    private String teamid;
    private ArrayList<String> members;
    private String taskid;

    public Team(String teamname, String teamid) {
        this.teamname = teamname;
        this.teamid = teamid;
        this.members = new ArrayList<>();
    }

    public void addMember(String member) {
        this.members.add(member);
    }

    public void removeMember(String member) {
        this.members.remove(member);
    }

    public String getTeamname() {
        return this.teamname;
    }

    public ArrayList<String> getMembers() {
        return this.members;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getTaskid() {
        return this.taskid;
    }
}

