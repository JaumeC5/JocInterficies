package com.rtypelite.game;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

import java.util.Vector;

/**
 * Created by jaume on 02/01/2018.
 */

public class ShotsManager extends Actor {

    Stage stage;
    private AssetsManager assets;

    public static Vector<Bullet> bullets = new Vector<Bullet>();

    public ShotsManager(AssetsManager assetsManager, Stage stage){
        assets = assetsManager;
        this.stage = stage;
    }

    public void act(float delta) {

        for (int i = 0; i < bullets.size(); i++) {
            stage.addActor(bullets.get(i));
			/*
			if(bullets.get(i).bounds.overlaps(gEnemy.bounds)){
				bullets.remove(i);
				gEnemy.remove();
			}
			*/
        }
    }
}
