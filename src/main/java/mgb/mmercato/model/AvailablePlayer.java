/**
 *-------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 *-------------------------------------------------------------------------
 */
package mgb.mmercato.model;

public class AvailablePlayer {

    private String id;
    private String lastname;
    private String firstname;
    private Integer position;
    private Integer quotation;
    private Integer ultraPosition;
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

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getQuotation() {
        return quotation;
    }

    public void setQuotation(Integer quotation) {
        this.quotation = quotation;
    }

    public Integer getUltraPosition() {
        return ultraPosition;
    }

    public void setUltraPosition(Integer ultraPosition) {
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
