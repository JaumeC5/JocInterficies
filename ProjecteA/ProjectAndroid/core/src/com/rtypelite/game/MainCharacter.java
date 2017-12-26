package com.rtypelite.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by jcompany on 12/18/2017.
 */

public class MainCharacter extends Actor {
    Texture playerTexture;
    Sprite playerSprite;

    float playerSpeed = 2;

    public MainCharacter(Texture texture){
        this.playerTexture = texture;
        playerSprite = new Sprite(this.playerTexture);
    }

    public void goUp(){
        if(playerSprite.getY() + playerSprite.getHeight() <= Gdx.graphics.getHeight()){
            playerSprite.setY(playerSprite.getY() + playerSpeed);
        }
    }

    public void goDown(){
        if(playerSprite.getY() <= 0){
            playerSprite.setY(playerSprite.getY() - playerSpeed);
        }
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(playerTexture, getX(), getY(), 0, 0, playerTexture.getWidth(), playerTexture.getHeight(), getScaleX(),
                   getScaleY(), getRotation(), 0, 0, playerTexture.getWidth(), playerTexture.getHeight(), false, false);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    public Vector2 getPos(){
        Vector2 pos = new Vector2(getX(), getY());
        return pos;
    }
}
