package ponciano.rom.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ponciano.rom.domain.entity.Jutsu;

@Repository
public interface JutsuRepository extends MongoRepository<Jutsu, String> {
}
