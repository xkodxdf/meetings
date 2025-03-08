package com.xkodxdf.app.raketa.renderers.renderer_enum;

import com.xkodxdf.app.raketa.renderers.entities.Entity;
import com.xkodxdf.app.raketa.renderers.entities.Herbivore;
import com.xkodxdf.app.raketa.renderers.entities.Predator;

public enum EntityNotationProvider {

    ASCII(
            " . ",
            " @ ",
            " $ "
    ),
    LETTER(
            "E",
            "H",
            "P"
    ),
    NUMBER(
            " 0 ",
            " 1 ",
            " 2 "
    ),
    EMOJI(
            "\uD83D\uDFEB",
            "\uD83E\uDD8C",
            "\uD83D\uDC3A"
    );


    private final String herbivore;
    private final String predator;
    private final String emptyCell;

    EntityNotationProvider(String emptyCell, String herbivore, String predator) {
        this.emptyCell = emptyCell;
        this.herbivore = herbivore;
        this.predator = predator;
    }

    public String get(Entity entity) {
        if (entity == null) {
            return emptyCell;
        }
        if (entity instanceof Herbivore) {
            return herbivore;
        }
        if (entity instanceof Predator) {
            return predator;
        }
        throw new IllegalArgumentException();
    }
}
