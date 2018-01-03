package com.rtypelite.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by jaume on 02/01/2018.
 */

public class EnemyManager extends Actor {

    MathUtils mathU;
    Stage stage;
    private AssetsManager assets;
    private int oCount = -1;
    private int gCount = -1;

    public EnemyManager(AssetsManager assetsManager, Stage stage){
        assets = assetsManager;
        this.stage = stage;
    }
    public void act(float delta){
        if(oCount % mathU.random(200, 400) == 0) {
            OrangeEnemy oEnemy = new OrangeEnemy(assets.textureOrangeEnemy);
            oEnemy.setPosition(Gdx.graphics.getWidth(), mathU.random(0, Gdx.graphics.getHeight() - assets.textureOrangeEnemy.getHeight()));
            stage.addActor(oEnemy);
        }

        if(gCount % mathU.random(400, 600) == 0){
            GreenEnemy gEnemy = new GreenEnemy(assets.textureGreenEnemy);
            gEnemy.setPosition(Gdx.graphics.getWidth(), mathU.random(0, Gdx.graphics.getHeight() - assets.textureGreenEnemy.getHeight()));
            stage.addActor(gEnemy);

        }
        oCount++; gCount++;

    }
}
