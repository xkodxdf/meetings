package com.xkodxdf.app.raketa.renderers.renderer_enum;

import com.xkodxdf.app.raketa.renderers.entities.Entity;
import com.xkodxdf.app.raketa.renderers.entities.Herbivore;
import com.xkodxdf.app.raketa.renderers.entities.Predator;


import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<>();
        entities.add(new Herbivore());
        entities.add(new Predator());
        entities.add(null);

        Renderer renderer = new Renderer(EntityNotationProvider.EMOJI);

        for (EntityNotationProvider entityNotationProvider : EntityNotationProvider.values()) {
            renderer.setNotationProvider(entityNotationProvider);
            System.out.println(entityNotationProvider.name() + ":");
            renderer.render(entities);
        }

        System.out.println("Random switch notation");
        for (Entity entity : entities) {
            renderer.randomSwitchNotation();
            renderer.render(entity);
        }
    }
}
