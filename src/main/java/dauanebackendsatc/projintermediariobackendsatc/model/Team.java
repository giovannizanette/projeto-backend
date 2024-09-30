package dauanebackendsatc.projintermediariobackendsatc.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<ModelPlayer> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<ModelPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<ModelPlayer> players) {
        this.players = players;
    }

    public void addPlayer(ModelPlayer player) {
        players.add(player);
    }

}
