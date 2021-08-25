package ponciano.rom.rpgnarutoapi.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class BaseRepository<E> implements MongoRepository<E, String> {
}
