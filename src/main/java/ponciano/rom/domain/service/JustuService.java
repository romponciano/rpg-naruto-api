package ponciano.rom.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ponciano.rom.domain.entity.Jutsu;
import ponciano.rom.domain.repository.JutsuRepository;

@Service
public class JustuService extends BaseService<Jutsu, JutsuRepository> {
    @Autowired
    private JutsuRepository repository;

    @Override
    JutsuRepository repository() {
        return this.repository;
    }
}
