package ponciano.rom.rpgnarutoapi.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ponciano.rom.rpgnarutoapi.domain.repository.BaseRepository;
import ponciano.rom.rpgnarutoapi.domain.service.BaseService;

public abstract class BaseController<E, R extends BaseRepository<E>, S extends BaseService<E, R>> {
    abstract S service();

    @PostMapping("/")
    public E save(@RequestBody E entity) {
        return service().save(entity);
    }

    @GetMapping("/{id}")
    public E getById(@RequestParam String id) {
        E result = service().findById(id);
        if(result == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return result;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@RequestParam String id) {
        service().delete(id);
    }
}
