package net.iozhukov.modulator.module.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Entity {
    private Long id;
    private String name;
}
