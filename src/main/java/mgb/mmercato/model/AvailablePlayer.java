package mgb.mmercato.model;

public class AvailablePlayer {

    private String id;
    private String lastname;
    private String firstname;
    private int position;
    private int quotation;
    private int ultraPosition;
    private String club;
    private String teamid;
    private String joinDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getQuotation() {
        return quotation;
    }

    public void setQuotation(int quotation) {
        this.quotation = quotation;
    }

    public int getUltraPosition() {
        return ultraPosition;
    }

    public void setUltraPosition(int ultraPosition) {
        this.ultraPosition = ultraPosition;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getTeamid() {
        return teamid;
    }

    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "AvailablePlayer{" +
                "id='" + id + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", position=" + position +
                ", quotation=" + quotation +
                ", ultraPosition=" + ultraPosition +
                ", club='" + club + '\'' +
                ", teamid='" + teamid + '\'' +
                ", joinDate='" + joinDate + '\'' +
                '}';
    }
}
