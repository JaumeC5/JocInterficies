package com.rtypelite.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by jaume on 26/12/2017.
 */

public class Bullet extends Actor {

    Texture bulletTexture;
    Sprite bulletSprite;

    public Bullet(Texture texture){
        this.bulletTexture = texture;
        //bulletSprite = new Sprite(this.bulletTexture);
    }


    static public void addBullet(Bullet b){
        RTypeLite.bullets.add(b);
    }

    static public Bullet getBullet(int pos){
        return RTypeLite.bullets.get(pos);
    }

    static public void deleteBullet(int bullet){
        RTypeLite.bullets.remove(getBullet(bullet));
    }


    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(bulletTexture, getX(), getY(), RTypeLite.player.getPos().x, RTypeLite.player.getPos().y,
                bulletTexture.getWidth(), bulletTexture.getHeight(), getScaleX(), getScaleY(), getRotation(),
                0, 0, bulletTexture.getWidth(), bulletTexture.getHeight(), false, false);
    }

    @Override
    public void act(float delta) {
        setX(getX() + 200* delta);
        //setX(RTypeLite.player.getPos().x);
        //setY(RTypeLite.player.getPos().y);
    }
}
