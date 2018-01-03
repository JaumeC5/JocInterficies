package com.rtypelite.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by jaume on 26/12/2017.
 */

public abstract class Enemy extends GameObject {

    public int velX, velY;
    public Rectangle bounds;
    MathUtils mathU;

    public Enemy(Texture texture){
        this.texture = texture;
        bounds = new Rectangle(getX(), getY(), texture.getWidth(), texture.getHeight());
    }

    //public abstract void draw(Batch batch, float parentAlpha);

    @Override
    public abstract void act(float delta);

}
