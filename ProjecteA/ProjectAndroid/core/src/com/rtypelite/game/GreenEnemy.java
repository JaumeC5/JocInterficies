package com.rtypelite.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by jaume on 26/12/2017.
 */

public class GreenEnemy extends Enemy {

    private Boolean turn = false;

    public GreenEnemy(Texture texture){
        super(texture);
        velX = MathUtils.random(20, 40);
        velY = MathUtils.random(60, 120);
    }

    @Override
    public void act(float delta) {
        setX(getX() - velX * delta);
        if(getY() <= 0){
            turn = true;
        }
        if(getY() >= Gdx.graphics.getHeight() - texture.getHeight()){
            turn = false;
        }

        if(turn == true){
            setY(getY() + velY * delta);
        }
        else if(turn == false){
            setY(getY() - velY * delta);
        }
    }


}
