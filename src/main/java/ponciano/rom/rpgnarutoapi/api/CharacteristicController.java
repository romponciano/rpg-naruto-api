package ponciano.rom.rpgnarutoapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ponciano.rom.rpgnarutoapi.domain.entity.Characteristic;
import ponciano.rom.rpgnarutoapi.domain.repository.CharacteristicRepository;
import ponciano.rom.rpgnarutoapi.domain.service.CharacteristicService;

@RestController
@RequestMapping("/char")
public class CharacteristicController extends BaseController<Characteristic, CharacteristicRepository, CharacteristicService> {
    @Autowired private CharacteristicService service;

    @Override
    CharacteristicService service() {
        return service;
    }
}
