package ponciano.rom.rpgnarutoapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ponciano.rom.rpgnarutoapi.domain.entity.Jutsu;
import ponciano.rom.rpgnarutoapi.domain.repository.JutsuRepository;
import ponciano.rom.rpgnarutoapi.domain.service.JustuService;

@RestController
@RequestMapping("/jutsu")
public class JutsuController extends BaseController<Jutsu, JutsuRepository, JustuService> {

    @Autowired private JustuService service;

    @Override
    JustuService service() {
        return service;
    }
}
