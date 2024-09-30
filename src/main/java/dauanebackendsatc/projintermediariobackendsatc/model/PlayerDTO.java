package dauanebackendsatc.projintermediariobackendsatc.model;


import java.util.List;

public class PlayerDTO {
    private List<ModelPlayer> player;

    public PlayerDTO() {
        // Default constructor
    }

    public List<ModelPlayer> getModelPlayer() {
        return player;
    }

    public void setPlayer(List<ModelPlayer> player) {
        this.player = player;
    }
}