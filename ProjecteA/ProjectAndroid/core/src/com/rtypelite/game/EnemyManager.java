package com.rtypelite.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by jaume on 02/01/2018.
 */

public class EnemyManager extends Actor {

    private int oCount = -1;
    private int gCount = -1;
    public static Group enemies;

    public EnemyManager(){
        enemies = new Group();
    }
    public void act(float delta){
        if(oCount % MathUtils.random(200, 400) == 0) {
            OrangeEnemy oEnemy = new OrangeEnemy(RTypeLite.assets.textureOrangeEnemy);
            oEnemy.setPosition(Gdx.graphics.getWidth(), MathUtils.random(0, Gdx.graphics.getHeight() - RTypeLite.assets.textureOrangeEnemy.getHeight()));
            enemies.addActor(oEnemy);
        }

        if(gCount % MathUtils.random(400, 600) == 0){
            GreenEnemy gEnemy = new GreenEnemy(RTypeLite.assets.textureGreenEnemy);
            gEnemy.setPosition(Gdx.graphics.getWidth(), MathUtils.random(0, Gdx.graphics.getHeight() - RTypeLite.assets.textureGreenEnemy.getHeight()));
            enemies.addActor(gEnemy);
        }
        oCount++; gCount++;

    }
}
