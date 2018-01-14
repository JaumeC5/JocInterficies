package com.rtypelite.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

import java.util.Vector;

/**
 * Created by jaume on 02/01/2018.
 */

public class ShotsManager extends Actor {

    public static Vector<Bullet> bullets = new Vector<Bullet>();
    public static Sound shotSound;

    public ShotsManager(){}

    public static void ShotSound(){
        shotSound = RTypeLite.manager.get("bulletS.wav");
        shotSound.play();
    }

    public void act(float delta) {

        for (int i = 0; i < bullets.size(); i++) {
            RTypeLite.stage.addActor(bullets.get(i));
			/*
			if(bullets.get(i).bounds.overlaps(gEnemy.bounds)){
				bullets.remove(i);
				gEnemy.remove();
			}
			*/
        }
    }
}
