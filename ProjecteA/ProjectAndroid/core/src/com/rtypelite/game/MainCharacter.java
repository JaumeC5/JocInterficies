package com.rtypelite.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;

/**
 * Created by jcompany on 12/18/2017.
 */

public class MainCharacter extends GameObject {

    float playerSpeed = 5;

    public MainCharacter(Texture texture){
        this.texture = texture;
    }

    public void goUp(){
        if(getY() <= Gdx.graphics.getHeight()){
            setY(getY() - playerSpeed);
        }
    }

    public void goDown(){
        if(getY() >= getHeight()){
            setY(getY() + playerSpeed);
        }
    }

    @Override
    public void act(float delta) {
        if(getY() >= Gdx.graphics.getHeight() - 10){
            setY(Gdx.graphics.getHeight() - 10);
        }
        if(getY() <= texture.getHeight() - 30){
            setY(texture.getHeight() - 30);
        }
    }
}
