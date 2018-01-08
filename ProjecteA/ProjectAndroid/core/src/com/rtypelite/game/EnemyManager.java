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

    //Stage stage;
    private AssetsManager assets;
    private int oCount = -1;
    private int gCount = -1;
    public static Group enemies;

    public EnemyManager(AssetsManager assetsManager, Stage stage){
        assets = assetsManager; //ferla statica
        //this.stage = stage;
        enemies = new Group();
    }
    public void act(float delta){
        if(oCount % MathUtils.random(200, 400) == 0) {
            OrangeEnemy oEnemy = new OrangeEnemy(assets.textureOrangeEnemy);
            oEnemy.setPosition(Gdx.graphics.getWidth(), MathUtils.random(0, Gdx.graphics.getHeight() - assets.textureOrangeEnemy.getHeight()));
            enemies.addActor(oEnemy);
        }

        if(gCount % MathUtils.random(400, 600) == 0){
            GreenEnemy gEnemy = new GreenEnemy(assets.textureGreenEnemy);
            gEnemy.setPosition(Gdx.graphics.getWidth(), MathUtils.random(0, Gdx.graphics.getHeight() - assets.textureGreenEnemy.getHeight()));
            enemies.addActor(gEnemy);
        }
        oCount++; gCount++;

    }
}
