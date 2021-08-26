package ponciano.rom.rpgnarutoapi.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ponciano.rom.rpgnarutoapi.domain.entity.Jutsu;
import ponciano.rom.rpgnarutoapi.domain.repository.JutsuRepository;

@Service
public class JustuService extends BaseService<Jutsu, JutsuRepository> {
    @Autowired private JutsuRepository repository;

    @Override
    JutsuRepository repository() {
        return this.repository;
    }
}
