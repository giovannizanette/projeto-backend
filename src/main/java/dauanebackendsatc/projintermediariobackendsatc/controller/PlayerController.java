package dauanebackendsatc.projintermediariobackendsatc.controller;

import dauanebackendsatc.projintermediariobackendsatc.model.ModelPlayer;
import dauanebackendsatc.projintermediariobackendsatc.model.PlayerDTO;
import dauanebackendsatc.projintermediariobackendsatc.model.RequestPlayerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import dauanebackendsatc.projintermediariobackendsatc.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("team")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping()
    public ResponseEntity<?> addPlayerToTeam(@RequestBody RequestPlayerDTO playerName)throws Exception {
        PlayerDTO playerDTO = playerService.getPlayerDetails(playerName.playerName());
        return ResponseEntity.ok("Player's name: " + playerDTO.getModelPlayer().get(0).getStrPlayer());
    }

    @GetMapping()
    public List<ModelPlayer> showTeam()throws Exception {
        return playerService.getTeam();
    }

    @GetMapping("/ajuda")
    public ResponseEntity<?> getHelp() {
        String getHelp = "{\"Estudante\": \" Dauane Neves\", \"Projeto\": \"Projeto Intermediário Backend\"}";
        return ResponseEntity.ok(getHelp);
    }

}

