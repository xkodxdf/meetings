package com.xkodxdf.app.raketa.renderers.renderer_enum;

import com.xkodxdf.app.raketa.renderers.entities.Entity;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Renderer {

    private EntityNotationProvider notationProvider;

    public Renderer(EntityNotationProvider notationProvider) {
        this.notationProvider = notationProvider;
    }

    public void setNotationProvider(EntityNotationProvider notationProvider) {
        this.notationProvider = notationProvider;
    }

    public void render(Entity entity) {
        System.out.println(notationProvider.get(entity));
    }

    public void render(List<Entity> entities) {
        entities.forEach(this::render);
    }

    public void randomSwitchNotation() {
        EntityNotationProvider[] notations = EntityNotationProvider.values();
        int randomNotationIndex = ThreadLocalRandom.current().nextInt(notations.length);
        notationProvider = notations[randomNotationIndex];
    }
}
