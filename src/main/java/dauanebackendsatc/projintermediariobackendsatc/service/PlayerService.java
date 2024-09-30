package dauanebackendsatc.projintermediariobackendsatc.service;

import dauanebackendsatc.projintermediariobackendsatc.model.ModelPlayer;
import dauanebackendsatc.projintermediariobackendsatc.model.PlayerDTO;
import dauanebackendsatc.projintermediariobackendsatc.model.Team;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PlayerService {
    private static final String BaseURL = "https://www.thesportsdb.com/api/v1/json/3/searchplayers.php?p=";

    private Team team;

    public PlayerService() {
        this.team = new Team("Team Name");
    }

    public PlayerDTO getPlayerDetails(String playerName) throws Exception{
        RestTemplate restTemplate = new RestTemplate();
        String URLplayer = BaseURL + playerName;
        PlayerDTO playerDTO = null;

        try {
            playerDTO = restTemplate.getForObject(URLplayer, PlayerDTO.class);
            addToTeam(playerDTO.getModelPlayer().get(0));
        } catch (Throwable erro) {
            System.out.println("Error: " + erro.getMessage());
        }

        return playerDTO;
    }

    public void addToTeam(ModelPlayer modelPlayer){
        team.addPlayer(modelPlayer);
        System.out.println("Player added to team: " + modelPlayer.getStrPlayer());
    }
    public List<ModelPlayer> getTeam() {
        return team.getPlayers();
    }
}
