/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */
package mgb.mmercato.model;

import java.util.List;

public class Mercato
{

  private String leagueId;

  private Integer turn;

  private Integer season;

  private Integer statusLeague;

  private String currentUser;

  private Integer championship;

  private Integer statusTeam;

  private Integer leagueMode;

  private Integer budget;

  private String currentTeam;

  private List<AvailablePlayer> availablePlayers;

  private List<UserPlayer> userPlayers;

  private Integer nextMatchIn;

  private Integer matchesToComeMercato;

  private Integer matchesToComeReal;

  private Integer nextTurnIn;

  public String getLeagueId()
  {
    return leagueId;
  }

  public void setLeagueId(String leagueId)
  {
    this.leagueId = leagueId;
  }

  public Integer getTurn()
  {
    return turn;
  }

  public void setTurn(Integer turn)
  {
    this.turn = turn;
  }

  public Integer getSeason()
  {
    return season;
  }

  public void setSeason(Integer season)
  {
    this.season = season;
  }

  public Integer getStatusLeague()
  {
    return statusLeague;
  }

  public void setStatusLeague(Integer statusLeague)
  {
    this.statusLeague = statusLeague;
  }

  public String getCurrentUser()
  {
    return currentUser;
  }

  public void setCurrentUser(String currentUser)
  {
    this.currentUser = currentUser;
  }

  public Integer getChampionship()
  {
    return championship;
  }

  public void setChampionship(Integer championship)
  {
    this.championship = championship;
  }

  public Integer getStatusTeam()
  {
    return statusTeam;
  }

  public void setStatusTeam(Integer statusTeam)
  {
    this.statusTeam = statusTeam;
  }

  public Integer getLeagueMode()
  {
    return leagueMode;
  }

  public void setLeagueMode(Integer leagueMode)
  {
    this.leagueMode = leagueMode;
  }

  public Integer getBudget()
  {
    return budget;
  }

  public void setBudget(Integer budget)
  {
    this.budget = budget;
  }

  public String getCurrentTeam()
  {
    return currentTeam;
  }

  public void setCurrentTeam(String currentTeam)
  {
    this.currentTeam = currentTeam;
  }

  public List<AvailablePlayer> getAvailablePlayers()
  {
    return availablePlayers;
  }

  public void setAvailablePlayers(List<AvailablePlayer> availablePlayers)
  {
    this.availablePlayers = availablePlayers;
  }

  public List<UserPlayer> getUserPlayers()
  {
    return userPlayers;
  }

  public void setUserPlayers(List<UserPlayer> userPlayers)
  {
    this.userPlayers = userPlayers;
  }

  public Integer getNextMatchIn()
  {
    return nextMatchIn;
  }

  public void setNextMatchIn(Integer nextMatchIn)
  {
    this.nextMatchIn = nextMatchIn;
  }

  public Integer getMatchesToComeMercato()
  {
    return matchesToComeMercato;
  }

  public void setMatchesToComeMercato(Integer matchesToComeMercato)
  {
    this.matchesToComeMercato = matchesToComeMercato;
  }

  public Integer getMatchesToComeReal()
  {
    return matchesToComeReal;
  }

  public void setMatchesToComeReal(Integer matchesToComeReal)
  {
    this.matchesToComeReal = matchesToComeReal;
  }

  public Integer getNextTurnIn()
  {
    return nextTurnIn;
  }

  public void setNextTurnIn(Integer nextTurnIn)
  {
    this.nextTurnIn = nextTurnIn;
  }

  @Override public String toString()
  {
    return "Mercato{" + "leagueId='" + leagueId + '\'' + ", turn=" + turn + ", season=" + season + ", statusLeague=" + statusLeague + ", currentUser='"
            + currentUser + '\'' + ", championship=" + championship + ", statusTeam=" + statusTeam + ", leagueMode=" + leagueMode + ", budget=" + budget
            + ", currentTeam='" + currentTeam + '\'' + ", availablePlayers=" + availablePlayers + ", userPlayers=" + userPlayers + ", nextMatchIn="
            + nextMatchIn + ", matchesToComeMercato=" + matchesToComeMercato + ", matchesToComeReal=" + matchesToComeReal + ", nextTurnIn=" + nextTurnIn + '}';
  }
}
