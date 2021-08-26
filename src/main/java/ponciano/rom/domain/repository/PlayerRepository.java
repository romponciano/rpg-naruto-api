package ponciano.rom.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ponciano.rom.domain.entity.Player;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {
}
