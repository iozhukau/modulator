package net.iozhukov.modulator.module.api;

import lombok.RequiredArgsConstructor;
import net.iozhukov.modulator.module.api.view.Entity;
import net.iozhukov.modulator.module.service.EntityFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/entity")
@RequiredArgsConstructor
public class EntityRestController implements EntityInterface {

    public final EntityFacade entityFacade;

    @Override
    @GetMapping(path = "/{id}")
    public Entity getOneById(@PathVariable Long id) {
        var entity = entityFacade.getOneById(id);
        return entity.map(model -> new Entity(model.getId(), model.getName()))
                .orElse(null);
    }
}
