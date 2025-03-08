package com.xkodxdf.app.raketa.renderers.renderer_enum;

import com.xkodxdf.app.raketa.renderers.entities.Herbivore;
import com.xkodxdf.app.raketa.renderers.entities.Predator;

public class Run {

    public static void main(String[] args) {
        Herbivore herbivore = new Herbivore();
        Predator predator = new Predator();

        System.out.println("emoji:");
        Renderer renderer = new Renderer(EntityNotationProvider.EMOJI);
        renderer.render(herbivore);
        renderer.render(predator);

        System.out.println("ascii");
        renderer.setNotationProvider(EntityNotationProvider.ASCII);
        renderer.render(herbivore);
        renderer.render(predator);

        System.out.println("number");
        renderer.setNotationProvider(EntityNotationProvider.NUMBER);
        renderer.render(herbivore);
        renderer.render(predator);

        System.out.println("random notation switch");
        for (int i = 0; i < 5; i++) {
            renderer.randomSwitchNotation();
            renderer.render(herbivore);
            renderer.render(predator);
        }
    }
}
