package ponciano.rom.rpgnarutoapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ponciano.rom.rpgnarutoapi.domain.entity.Player;
import ponciano.rom.rpgnarutoapi.domain.repository.PlayerRepository;
import ponciano.rom.rpgnarutoapi.domain.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController extends BaseController<Player, PlayerRepository, PlayerService> {

    @Autowired private PlayerService service;

    @Override
    PlayerService service() {
        return service;
    }
}
