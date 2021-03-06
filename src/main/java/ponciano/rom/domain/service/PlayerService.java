package ponciano.rom.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ponciano.rom.domain.entity.Player;
import ponciano.rom.domain.repository.PlayerRepository;

@Service
public class PlayerService extends BaseService<Player, PlayerRepository> {
    @Autowired
    private PlayerRepository repository;

    @Override
    PlayerRepository repository() {
        return repository;
    }
}
