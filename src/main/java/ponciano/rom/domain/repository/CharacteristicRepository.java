package ponciano.rom.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ponciano.rom.domain.entity.Characteristic;

@Repository
public interface CharacteristicRepository extends MongoRepository<Characteristic, String> {
}
