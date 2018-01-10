package com.rtypelite.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by jaume on 02/01/2018.
 */

public abstract class GameObject extends Actor {
    public Texture texture;

    public void draw(Batch batch, float parentAlpha) {
        batch.draw(texture, getX(), getY(), 0, 0, texture.getWidth(), texture.getHeight(), getScaleX(),
                getScaleY(), getRotation(), 0, 0, texture.getWidth(), texture.getHeight(), true, false);
    }
    @Override
    public abstract void act(float delta);
    //Game object ferla abstracta i act abstracte
}
