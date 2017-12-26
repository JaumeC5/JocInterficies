package com.rtypelite.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

import java.util.ArrayList;


public class RTypeLite extends Game {

	private InputProcesador inputprac;
	private Stage stage;

	public static MainCharacter player;
	private Texture texturePlayer;
	private Texture textureOrangeEnemy;
	private Texture textureGreenEnemy;
	private Texture textureBullet;

	static ArrayList<Bullet> bullets = new ArrayList<Bullet>();

	@Override
	public void create () {
		stage = new Stage();

		//Player
		texturePlayer = new Texture("spaceship.png");
		player = new MainCharacter(texturePlayer);
		stage.addActor(player);
		player.setPosition(100, 100);

		//Enemies
		textureOrangeEnemy = new Texture("enemyOrange.png");
		textureGreenEnemy = new Texture("enemyGreen.png");

		inputprac = new InputProcesador(player);
		Gdx.input.setInputProcessor(inputprac);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stage.act();
		stage.draw();

		Bullet b = new Bullet(textureBullet);
		Bullet.addBullet(b);

	}
	
	@Override
	public void dispose () {
		super.dispose();
		stage.dispose();
		texturePlayer.dispose();
		textureGreenEnemy.dispose();
		textureOrangeEnemy.dispose();

	}

	public void input(){
		if (Gdx.input.isTouched()){
			if(Gdx.input.getX() < Gdx.graphics.getWidth()/2){
				//prota.setRotation(prota.getRotation() + 5);
			}
			else {
				//prota.setRotation(prota.getRotation() - 5);
			}
		}
	}



}
