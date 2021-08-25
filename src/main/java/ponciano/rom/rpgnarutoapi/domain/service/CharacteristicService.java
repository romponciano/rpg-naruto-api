package ponciano.rom.rpgnarutoapi.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ponciano.rom.rpgnarutoapi.domain.entity.Characteristic;
import ponciano.rom.rpgnarutoapi.domain.repository.CharacteristicRepository;

@Service
public class CharacteristicService extends BaseService<Characteristic, CharacteristicRepository> {
    @Autowired private CharacteristicRepository repository;

    @Override
    CharacteristicRepository repository() {
        return this.repository;
    }
}
