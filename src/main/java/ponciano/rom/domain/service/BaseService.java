package ponciano.rom.domain.service;

import org.springframework.data.mongodb.repository.MongoRepository;

public abstract class BaseService<E, R extends MongoRepository<E, String>> {

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
