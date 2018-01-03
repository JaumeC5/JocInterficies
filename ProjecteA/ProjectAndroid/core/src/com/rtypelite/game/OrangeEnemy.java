package com.rtypelite.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by jaume on 26/12/2017.
 */

public class OrangeEnemy extends Enemy {

    public OrangeEnemy(Texture texture){
        super(texture);
        velX = 50;
        bounds = new Rectangle(getX(), getY(), texture.getWidth(), texture.getHeight());
    }

    @Override
    public void act(float delta) {
        setX(getX() - velX * delta);
    }

}
