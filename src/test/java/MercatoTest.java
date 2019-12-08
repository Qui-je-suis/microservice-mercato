/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import mgb.mmercato.model.AvailablePlayer;
import mgb.mmercato.model.Mercato;
import mgb.mmercato.model.UserPlayer;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MercatoTest
{

  @Test
  // Test to convert Json file in Object
  public void getMercatoJson() throws IOException
  {

    // the Json file location
    String jsonFile = "src/test/resources/mercato-mpg.json";

    // read the Json file data to String
    byte[] jsonData = Files.readAllBytes(Paths.get(jsonFile));

    // create ObjectMapper instance
    ObjectMapper objectMapper = new ObjectMapper();

    // convert Json String to Object
    Mercato mercato = objectMapper.readValue(jsonData, Mercato.class);

    System.out.println(objectMapper.writeValueAsString(mercato));
  }

  @Test
  // Test to convert Object in Json file
  public void getMercatoObject() throws IOException
  {

    // convert Object to Json String
    Mercato mercato = createMercato();

    // create ObjectMapper instance
    ObjectMapper objectMapper = new ObjectMapper();

    // configure Object mapper for pretty print
    objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

    // writing to console, can write to any output stream such a file
    StringWriter stringMercato = new StringWriter();
    objectMapper.writeValue(stringMercato, mercato);

    System.out.println("Mercato JSON is\n" + stringMercato);

  }

  private Mercato createMercato()
  {

    Mercato mercato = new Mercato();
    mercato.setLeagueId("QUI-JE-SUIS ?");
    mercato.setTurn(10);
    mercato.setSeason(11);
    mercato.setStatusLeague(12);
    mercato.setCurrentUser("jsaispascquecest");
    mercato.setChampionship(13);
    mercato.setStatusTeam(14);
    mercato.setLeagueMode(15);
    mercato.setBudget(999);
    mercato.setCurrentTeam("team");
    List<AvailablePlayer> availablePlayers = createPlayers();
    mercato.setAvailablePlayers(availablePlayers);
    List<UserPlayer> userPlayers = createUserPlayers();
    mercato.setUserPlayers(userPlayers);
    mercato.setNextMatchIn(123456);
    mercato.setMatchesToComeMercato(50);
    mercato.setMatchesToComeReal(50);
    mercato.setNextTurnIn(16);

    return mercato;
  }

  private List<AvailablePlayer> createPlayers()
  {

    List<AvailablePlayer> availablePlayers = new ArrayList<AvailablePlayer>();
    AvailablePlayer availablePlayer1 = new AvailablePlayer();
    availablePlayer1.setId("player_1");
    availablePlayer1.setLastname("Cousin");
    availablePlayer1.setFirstname("Michael");
    availablePlayer1.setPosition(9);
    availablePlayer1.setQuotation(1);
    availablePlayer1.setUltraPosition(69);
    availablePlayer1.setClub("Abricot FC");
    availablePlayer1.setTeamid("654321");
    availablePlayer1.setJoinDate("2018-09-24");
    availablePlayers.add(availablePlayer1);

    return availablePlayers;
  }

  private List<UserPlayer> createUserPlayers()
  {

    List<UserPlayer> userPlayers = new ArrayList<UserPlayer>();
    UserPlayer userPlayer = new UserPlayer(null, null, null);
    userPlayers.add(userPlayer);

    return userPlayers;
  }
}
