package net.iozhukov.modulator.module.service;

import net.iozhukov.modulator.module.model.Entity;

import java.util.Optional;

public interface EntityFacade {

    Optional<Entity> getOneById(Long id);
}
