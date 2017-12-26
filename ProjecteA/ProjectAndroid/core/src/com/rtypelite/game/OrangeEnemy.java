package com.rtypelite.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

/**
 * Created by jaume on 26/12/2017.
 */

public class OrangeEnemy extends Enemy {

    public OrangeEnemy(Texture texture){
        super(texture);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(enemyTexture, getX(), getY(), 0, 0, enemyTexture.getWidth(), enemyTexture.getHeight(), getScaleX(),
                getScaleY(), getRotation(), 0, 0, enemyTexture.getWidth(), enemyTexture.getHeight(), false, false);
    }

    @Override
    public void act(float delta) {
        setX(getX() - 50* delta);
    }

}
