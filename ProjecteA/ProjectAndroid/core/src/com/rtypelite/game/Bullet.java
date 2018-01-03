package com.rtypelite.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by jaume on 26/12/2017.
 */

public class Bullet extends GameObject {

    int bulletSpeed;
    public Rectangle bounds;

    public Bullet(Texture texture){
        this.texture = texture;
        bulletSpeed = 150;
        setPosition(RTypeLite.player.getX()+ 90, RTypeLite.player.getY() - 43);
        bounds = new Rectangle(getX(), getY(), texture.getWidth(), texture.getHeight());
    }

    /*
    static public void addBullet(Bullet b){RTypeLite.bullets.add(b);}

    static public Bullet getBullet(int pos){return RTypeLite.bullets.get(pos);}

    static public void deleteBullet(int bullet){
        RTypeLite.bullets.remove(getBullet(bullet));
    }
    */


    @Override
    public void act(float delta) {
        setX(getX() + bulletSpeed* delta);

    }
}
