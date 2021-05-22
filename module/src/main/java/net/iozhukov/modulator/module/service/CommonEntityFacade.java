package net.iozhukov.modulator.module.service;

import net.iozhukov.modulator.module.model.Entity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommonEntityFacade implements EntityFacade {

    public Optional<Entity> getOneById(Long id) {
        return Optional.of(Entity.builder().id(1L).name("Product").build());
    }
}
