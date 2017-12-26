package com.rtypelite.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by jaume on 26/12/2017.
 */

public abstract class Enemy extends Actor {
    Texture enemyTexture;
    Sprite enemyPlayer;

    public Enemy(Texture texture){
        this.enemyTexture = texture;
        enemyPlayer = new Sprite(this.enemyPlayer);
    }

    @Override
    public abstract void draw(Batch batch, float parentAlpha);

    @Override
    public abstract void act(float delta);

}
