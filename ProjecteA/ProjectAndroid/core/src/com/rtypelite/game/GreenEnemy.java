package com.rtypelite.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by jaume on 26/12/2017.
 */

public class GreenEnemy extends Enemy{

    Sprite greenSprite;

    public GreenEnemy(Texture texture){
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

        if (greenSprite.getY() + greenSprite.getHeight() <= Gdx.graphics.getHeight()){
            setY(getY() - 100* delta);
        }

        if(greenSprite.getY() <= 0){
            setY(getY() + 100* delta);
        }


    }
}
