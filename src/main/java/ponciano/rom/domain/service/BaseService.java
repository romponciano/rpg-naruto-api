package ponciano.rom.rpgnarutoapi.domain.service;

import ponciano.rom.rpgnarutoapi.domain.repository.BaseRepository;

public abstract class BaseService<E, R extends BaseRepository<E>> {

    abstract R repository();

    public E save(E s) {
        return repository().save(s);
    }

    public E findById(String id) {
        return repository().findById(id).orElse(null);
    }

    public void delete(String id) {
        repository().deleteById(id);
    }
}
