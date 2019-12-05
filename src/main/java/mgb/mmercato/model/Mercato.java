/**
 *-------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 *-------------------------------------------------------------------------
 */
package mgb.mmercato.model;

import java.util.List;

public class Mercato {

    private String leagueId;
    private int turn;
    private int season;
    private int statusLeague;
    private String currentUser;
    private int championship;
    private int statusTeam;
    private int leagueMode;
    private int budget;
    private String currentTeam;
    private List<AvailablePlayer> availablePlayers;
    private List<UserPlayer> userPlayers;
    private int nextMatchIn;
    private int matchesToComeMercato;
    private int matchesToComeReal;
    private int nextTurnIn;

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getStatusLeague() {
        return statusLeague;
    }

    public void setStatusLeague(int statusLeague) {
        this.statusLeague = statusLeague;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public int getChampionship() {
        return championship;
    }

    public void setChampionship(int championship) {
        this.championship = championship;
    }

    public int getStatusTeam() {
        return statusTeam;
    }

    public void setStatusTeam(int statusTeam) {
        this.statusTeam = statusTeam;
    }

    public int getLeagueMode() {
        return leagueMode;
    }

    public void setLeagueMode(int leagueMode) {
        this.leagueMode = leagueMode;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getCurrentTeam() {
        return currentTeam;
    }

    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
    }

    public List<AvailablePlayer> getAvailablePlayers() {
        return availablePlayers;
    }

    public void setAvailablePlayers(List<AvailablePlayer> availablePlayers) {
        this.availablePlayers = availablePlayers;
    }

    public List<UserPlayer> getUserPlayers() {
        return userPlayers;
    }

    public void setUserPlayers(List<UserPlayer> userPlayers) {
        this.userPlayers = userPlayers;
    }

    public int getNextMatchIn() {
        return nextMatchIn;
    }

    public void setNextMatchIn(int nextMatchIn) {
        this.nextMatchIn = nextMatchIn;
    }

    public int getMatchesToComeMercato() {
        return matchesToComeMercato;
    }

    public void setMatchesToComeMercato(int matchesToComeMercato) {
        this.matchesToComeMercato = matchesToComeMercato;
    }

    public int getMatchesToComeReal() {
        return matchesToComeReal;
    }

    public void setMatchesToComeReal(int matchesToComeReal) {
        this.matchesToComeReal = matchesToComeReal;
    }

    public int getNextTurnIn() {
        return nextTurnIn;
    }

    public void setNextTurnIn(int nextTurnIn) {
        this.nextTurnIn = nextTurnIn;
    }

    @Override
    public String toString() {
        return "Mercato{" +
                "leagueId='" + leagueId + '\'' +
                ", turn=" + turn +
                ", season=" + season +
                ", statusLeague=" + statusLeague +
                ", currentUser='" + currentUser + '\'' +
                ", championship=" + championship +
                ", statusTeam=" + statusTeam +
                ", leagueMode=" + leagueMode +
                ", budget=" + budget +
                ", currentTeam='" + currentTeam + '\'' +
                ", availablePlayers=" + availablePlayers +
                ", userPlayers=" + userPlayers +
                ", nextMatchIn=" + nextMatchIn +
                ", matchesToComeMercato=" + matchesToComeMercato +
                ", matchesToComeReal=" + matchesToComeReal +
                ", nextTurnIn=" + nextTurnIn +
                '}';
    }
}
